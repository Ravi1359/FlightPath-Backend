package com.example.backend_Flight_Sim.dto.response;

/**
 * A class representing a simple weather response.
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
     * Constructs a SimpleWeatherResponse object with the given weather parameters.
     *
     * @param temperature2m  The temperature at 2 meters above the ground.
     * @param precipitation  The amount of precipitation.
     * @param windSpeed10m   The wind speed at 10 meters above the ground.
     */
    public SimpleWeatherResponse(double temperature2m, double precipitation, double windSpeed10m) {
        this.temperature2m = temperature2m;
        this.precipitation = precipitation;
        this.windSpeed10m = windSpeed10m;
    }

    /**
     * Retrieves the temperature at 2 meters above the ground.
     *
     * @return The temperature at 2 meters above the ground.
     */
    public double getTemperature2m() {
        return temperature2m;
    }

    /**
     * Sets the temperature at 2 meters above the ground.
     *
     * @param temperature2m The temperature at 2 meters above the ground to set.
     */
    public void setTemperature2m(double temperature2m) {
        this.temperature2m = temperature2m;
    }

    /**
     * Retrieves the amount of precipitation.
     *
     * @return The amount of precipitation.
     */
    public double getPrecipitation() {
        return precipitation;
    }

    /**
     * Sets the amount of precipitation.
     *
     * @param precipitation The amount of precipitation to set.
     */
    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    /**
     * Retrieves the wind speed at 10 meters above the ground.
     *
     * @return The wind speed at 10 meters above the ground.
     */
    public double getWindSpeed10m() {
        return windSpeed10m;
    }

    /**
     * Sets the wind speed at 10 meters above the ground.
     *
     * @param windSpeed10m The wind speed at 10 meters above the ground to set.
     */
    public void setWindSpeed10m(double windSpeed10m) {
        this.windSpeed10m = windSpeed10m;
    }
}
