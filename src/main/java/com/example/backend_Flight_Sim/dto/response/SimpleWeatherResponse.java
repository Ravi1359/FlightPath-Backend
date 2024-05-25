package com.example.backend_Flight_Sim.dto.response;

/**
 * Represents a simple weather response with temperature, precipitation, and wind speed.
 */
public class SimpleWeatherResponse {
    private double temperature2m;
    private double precipitation;
    private double windSpeed10m;

    /**
     * Default constructor.
     */
    public SimpleWeatherResponse() {}

    /**
     * Constructs a SimpleWeatherResponse with specified parameters.
     *
     * @param temperature2m The temperature at 2 meters above ground level.
     * @param precipitation The amount of precipitation.
     * @param windSpeed10m  The wind speed at 10 meters above ground level.
     */
    public SimpleWeatherResponse(double temperature2m, double precipitation, double windSpeed10m) {
        this.temperature2m = temperature2m;
        this.precipitation = precipitation;
        this.windSpeed10m = windSpeed10m;
    }

    // Getters and Setters
    // (Omitted for brevity)
}
