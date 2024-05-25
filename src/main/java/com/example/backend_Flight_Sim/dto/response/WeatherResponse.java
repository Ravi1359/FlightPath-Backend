package com.example.backend_Flight_Sim.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A class representing a weather response.
 */
public class WeatherResponse {
    private double latitude;
    private double longitude;
    private Current current;

    /**
     * Retrieves the latitude of the location.
     *
     * @return The latitude of the location.
     */
    @JsonProperty("latitude")
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the latitude of the location.
     *
     * @param latitude The latitude of the location to set.
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Retrieves the longitude of the location.
     *
     * @return The longitude of the location.
     */
    @JsonProperty("longitude")
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the longitude of the location.
     *
     * @param longitude The longitude of the location to set.
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Retrieves the current weather information.
     *
     * @return The current weather information.
     */
    @JsonProperty("current")
    public Current getCurrent() {
        return current;
    }

    /**
     * Sets the current weather information.
     *
     * @param current The current weather information to set.
     */
    public void setCurrent(Current current) {
        this.current = current;
    }

    /**
     * A nested class representing the current weather.
     */
    public static class Current {
        private double temperature2m;
        private double precipitation;
        private double windSpeed10m;

        /**
         * Retrieves the temperature at 2 meters above the ground.
         *
         * @return The temperature at 2 meters above the ground.
         */
        @JsonProperty("temperature_2m")
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
        @JsonProperty("precipitation")
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
        @JsonProperty("wind_speed_10m")
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
}
