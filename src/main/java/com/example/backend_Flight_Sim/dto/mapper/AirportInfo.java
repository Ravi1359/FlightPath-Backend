package com.example.backend_Flight_Sim.dto.mapper;

/**
 * Represents the information of an airport.
 */
public class AirportInfo {
    private String latitude;
    private String longitude;
    private String code;
    private String name;

    /**
     * Gets the latitude of the airport.
     *
     * @return the latitude of the airport.
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the latitude of the airport.
     *
     * @param latitude the latitude to set.
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * Gets the longitude of the airport.
     *
     * @return the longitude of the airport.
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the longitude of the airport.
     *
     * @param longitude the longitude to set.
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * Gets the code of the airport.
     *
     * @return the code of the airport.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code of the airport.
     *
     * @param code the code to set.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the name of the airport.
     *
     * @return the name of the airport.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the airport.
     *
     * @param name the name to set.
     */
    public void setName(String name) {
        this.name = name;
    }
}
