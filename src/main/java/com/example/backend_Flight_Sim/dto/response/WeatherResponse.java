package com.example.backend_Flight_Sim.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a weather response containing latitude, longitude, and current weather data.
 */
public class WeatherResponse {
    private double latitude;
    private double longitude;
    private Current current;

    /**
     * Represents the current weather data.
     */
    public static class Current {
        private double temperature2m;
        private double precipitation;
        private double windSpeed10m;

        /**
         * Get the temperature at 2 meters above ground level.
         *
         * @return The temperature at 2 meters.
         */
        @JsonProperty("temperature_2m")
        public double getTemperature2m() {
            return temperature2m;
        }

        /**
         * Set the temperature at 2 meters above ground level.
         *
         * @param temperature2m The temperature at 2 meters.
         */
        public void setTemperature2m(double temperature2m) {
            this.temperature2m = temperature2m;
        }

        /**
         * Get the precipitation amount.
         *
         * @return The precipitation amount.
         */
        @JsonProperty("precipitation")
        public double getPrecipitation() {
            return precipitation;
        }

        /**
         * Set the precipitation amount.
         *
         * @param precipitation The precipitation amount.
         */
        public void setPrecipitation(double precipitation) {
            this.precipitation = precipitation;
        }

        /**
         * Get the wind speed at 10 meters above ground level.
         *
         * @return The wind speed at 10 meters.
         */
        @JsonProperty("wind_speed_10m")
        public double getWindSpeed10m() {
            return windSpeed10m;
        }

        /**
         * Set the wind speed at 10 meters above ground level.
         *
         * @param windSpeed10m The wind speed at 10 meters.
         */
        public void setWindSpeed10m(double windSpeed10m) {
            this.windSpeed10m = windSpeed10m;
        }
    }

    /**
     * Get the latitude of the location.
     *
     * @return The latitude.
     */
    @JsonProperty("latitude")
    public double getLatitude() {
        return latitude;
    }

    /**
     * Set the latitude of the location.
     *
     * @param latitude The latitude.
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Get the longitude of the location.
     *
     * @return The longitude.
     */
    @JsonProperty("longitude")
    public double getLongitude() {
        return longitude;
    }

    /**
     * Set the longitude of the location.
     *
     * @param longitude The longitude.
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Get the current weather data.
     *
     * @return The current weather data.
     */
    @JsonProperty("current")
    public Current getCurrent() {
        return current;
    }

    /**
     * Set the current weather data.
     *
     * @param current The current weather data.
     */
    public void setCurrent(Current current) {
        this.current = current;
    }
}
