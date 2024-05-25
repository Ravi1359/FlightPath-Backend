package com.example.backend_Flight_Sim.dto.mapper;

/**
 * A class representing a flight point, typically an airport identified by its IATA code.
 */
public class FlightPoint {
    private String iataCode;

    /**
     * Retrieves the IATA code of the flight point.
     *
     * @return The IATA code of the flight point.
     */
    public String getIataCode() {
        return iataCode;
    }

    /**
     * Sets the IATA code of the flight point.
     *
     * @param iataCode The IATA code of the flight point to set.
     */
    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }
}
