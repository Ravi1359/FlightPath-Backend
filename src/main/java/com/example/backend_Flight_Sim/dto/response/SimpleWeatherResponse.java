package com.example.backend_Flight_Sim.dto.response;

public class SimpleWeatherResponse {
    private double temperature2m;
    private double precipitation;
    private double windSpeed10m;

    // Constructors
    public SimpleWeatherResponse() {}

    public SimpleWeatherResponse(double temperature2m, double precipitation, double windSpeed10m) {
        this.temperature2m = temperature2m;
        this.precipitation = precipitation;
        this.windSpeed10m = windSpeed10m;
    }

    // Getters and Setters
    public double getTemperature2m() {
        return temperature2m;
    }

    public void setTemperature2m(double temperature2m) {
        this.temperature2m = temperature2m;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public double getWindSpeed10m() {
        return windSpeed10m;
    }

    public void setWindSpeed10m(double windSpeed10m) {
        this.windSpeed10m = windSpeed10m;
    }
}
