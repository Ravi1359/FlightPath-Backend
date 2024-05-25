package com.example.backend_Flight_Sim.service;

import com.example.backend_Flight_Sim.dto.mapper.*;
import com.example.backend_Flight_Sim.dto.request.FlightDTO;
import com.example.backend_Flight_Sim.dto.response.SimpleWeatherResponse;
import com.example.backend_Flight_Sim.dto.response.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Service class for handling flight-related operations.
 */
@Service
public class FlightService {

    @Value("${open-meteo.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public FlightService(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }

    /**
     * Finds the flight path between two airports and retrieves weather information for the path.
     *
     * @param flightDTO The DTO containing start and end airport codes.
     * @return A JSON string representing the flight path and weather information.
     * @throws Exception If an error occurs during the process.
     */
    public String findPath(FlightDTO flightDTO) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        int[] start = getLatLng(flightDTO.getStart());
        int[] end = getLatLng(flightDTO.getEnd());
        String begin = Arrays.toString(start);
        String stop = Arrays.toString(end);

        String requestBody = "{\"start\": " + begin + ", \"goal\": " + stop + "}";
        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> response = restTemplate.postForEntity("https://astar-flight-pathfinding.onrender.com/path", entity, String.class);
        String path = response.getBody();

        List<SimpleWeatherResponse> weather = getWeatherForMultipleLocations(path);

        path.substring(0, path.length() - 1);

        String weatherJson = objectMapper.writeValueAsString(weather);

        String resultJson = path + ",\"weather\":" + weatherJson + "}";

        if (response.getStatusCode() == HttpStatus.OK) {
            return resultJson;
        } else {
            return "Error: " + response.getStatusCodeValue();
        }
    }

    /**
     * Retrieves the latitude and longitude coordinates for a given airport code.
     *
     * @param iataCode The IATA code of the airport.
     * @return An array containing latitude and longitude values.
     */
    public int[] getLatLng(String iataCode) {
        String url = "https://iatageo.com/getLatLng/" + iataCode;
        AirportInfo airportInfo = restTemplate.getForObject(url, AirportInfo.class);
        if (airportInfo != null) {
            int latitude = (int) Double.parseDouble(airportInfo.getLatitude());
            int longitude = (int) Double.parseDouble(airportInfo.getLongitude());
            return new int[]{latitude, longitude};
        }
        return null;
    }

    /**
     * Retrieves weather information for multiple locations along the flight path.
     *
     * @param jsonString The JSON string representing the flight path.
     * @return A list of SimpleWeatherResponse objects containing weather information.
     * @throws Exception If an error occurs during the process.
     */
    public List<SimpleWeatherResponse> getWeatherForMultipleLocations(String jsonString) throws Exception {
        CoordinatePath coordinatePath = objectMapper.readValue(jsonString, CoordinatePath.class);
        List<double[]> coordinates = coordinatePath.getPath();
        List<SimpleWeatherResponse> weatherResponses = new ArrayList<>();
        for (double[] coordinate : coordinates) {
            double latitude = coordinate[0];
            double longitude = coordinate[1];
            String url = String.format("%s?latitude=%f&longitude=%f&current=temperature_2m,precipitation,wind_speed_10m&forecast_days=1",
                    apiUrl, latitude, longitude);
            WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);
            if (response != null && response.getCurrent() != null) {
                WeatherResponse.Current current = response.getCurrent();
                SimpleWeatherResponse simpleResponse = new SimpleWeatherResponse(
                        current.getTemperature2m(),
                        current.getPrecipitation(),
                        current.getWindSpeed10m()
                );
                weatherResponses.add(simpleResponse);
            }
        }
        return weatherResponses;
    }
}
