package com.example.backend_Flight_Sim.dto.mapper;

/**
 * A class representing airport information including latitude, longitude, code, and name.
 */
public class AirportInfo {
    private String latitude;
    private String longitude;
    private String code;
    private String name;

    /**
     * Retrieves the latitude of the airport.
     *
     * @return The latitude of the airport.
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the latitude of the airport.
     *
     * @param latitude The latitude to set.
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * Retrieves the longitude of the airport.
     *
     * @return The longitude of the airport.
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the longitude of the airport.
     *
     * @param longitude The longitude to set.
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * Retrieves the code of the airport.
     *
     * @return The code of the airport.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code of the airport.
     *
     * @param code The code to set.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Retrieves the name of the airport.
     *
     * @return The name of the airport.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the airport.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }
}
