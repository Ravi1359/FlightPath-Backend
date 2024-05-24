package com.example.backend_Flight_Sim.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {
    private double latitude;
    private double longitude;
    private Current current;

    // Getters and Setters

    public static class Current {
        private double temperature2m;
        private double precipitation;
        private double windSpeed10m;

        // Getters and Setters
        @JsonProperty("temperature_2m")
        public double getTemperature2m() {
            return temperature2m;
        }

        public void setTemperature2m(double temperature2m) {
            this.temperature2m = temperature2m;
        }

        @JsonProperty("precipitation")
        public double getPrecipitation() {
            return precipitation;
        }

        public void setPrecipitation(double precipitation) {
            this.precipitation = precipitation;
        }

        @JsonProperty("wind_speed_10m")
        public double getWindSpeed10m() {
            return windSpeed10m;
        }

        public void setWindSpeed10m(double windSpeed10m) {
            this.windSpeed10m = windSpeed10m;
        }
    }

    @JsonProperty("latitude")
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("current")
    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}
