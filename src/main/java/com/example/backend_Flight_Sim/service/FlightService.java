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

    public String findPath(FlightDTO flightDTO) throws Exception {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        int[] start = getLatLng(flightDTO.getStart());
        int[] end = getLatLng(flightDTO.getEnd());
        String begin = Arrays.toString(start);
        String stop = Arrays.toString(end);

        String requestBody = "{\"start\": " + begin + ", \"goal\": " + stop + "}";
        System.out.println(requestBody);
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

    public int[] getLatLng(String iataCode) {
        String url = "https://iatageo.com/getLatLng/" + iataCode;
        AirportInfo airportInfo = restTemplate.getForObject(url, AirportInfo.class);
        if (airportInfo != null) {
            int latitude = (int) Double.parseDouble(airportInfo.getLatitude());
            int longitude = (int) Double.parseDouble(airportInfo.getLongitude());
            return new int[]{latitude, longitude};
        }
        return null; // or throw an exception if preferred
    }

    public List<SimpleWeatherResponse> getWeatherForMultipleLocations(String jsonString) throws Exception {
        // Parse the JSON string to extract coordinates
        CoordinatePath coordinatePath = objectMapper.readValue(jsonString, CoordinatePath.class);
        List<double[]> coordinates = coordinatePath.getPath();

        // Fetch weather data for each coordinate
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
//
//    public FlightIataCodes getFlightIataCodes(String combinedFlightName, String scheduledDepartureDate) {
//        // Extract carrier code and flight number
//        String[] flightInfo = extractCarrierCodeAndFlightNumber(combinedFlightName);
//        String carrierCode = flightInfo[0];
//        String flightNumber = flightInfo[1];
//
//        // Build the URL with extracted values
//        String url = UriComponentsBuilder.fromHttpUrl(apiUrl)
//                .queryParam("carrierCode", carrierCode)
//                .queryParam("flightNumber", flightNumber)
//                .queryParam("scheduledDepartureDate", scheduledDepartureDate)
//                .toUriString();
//
//        // Set up the headers
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Authorization", "Bearer " + apiKey);
//
//        // Create the HttpEntity with the headers
//        HttpEntity<String> entity = new HttpEntity<>(headers);
//
//        // Make the request
//        ResponseEntity<FlightData> response = restTemplate.exchange(url, HttpMethod.GET, entity, FlightData.class);
//        FlightData flightData = response.getBody();
//
//        String departureIataCode = null;
//        String arrivalIataCode = null;
//
//        if (flightData != null && flightData.getData() != null && !flightData.getData().isEmpty()) {
//            List<FlightPoint> flightPoints = flightData.getData().get(0).getFlightPoints();
//            if (flightPoints != null && !flightPoints.isEmpty()) {
//                departureIataCode = flightPoints.get(0).getIataCode();
//                if (flightPoints.size() > 1) {
//                    arrivalIataCode = flightPoints.get(1).getIataCode();
//                }
//            }
//        }

//        return new FlightIataCodes(departureIataCode, arrivalIataCode);
//    }

//    public static String[] extractCarrierCodeAndFlightNumber(String combinedFlightName) {
//        // Regular expression to split carrier code and flight number
//        String[] result = combinedFlightName.split("(?<=\\D)(?=\\d)");
//        return result;
//    }
}
