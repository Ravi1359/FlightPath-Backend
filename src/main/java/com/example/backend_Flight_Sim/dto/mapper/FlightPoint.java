package com.example.backend_Flight_Sim.dto.mapper;

/**
 * Represents a flight point containing an IATA code.
 */
public class FlightPoint {
    private String iataCode;

    /**
     * Gets the IATA code of the flight point.
     *
     * @return the IATA code.
     */
    public String getIataCode() {
        return iataCode;
    }

    /**
     * Sets the IATA code of the flight point.
     *
     * @param iataCode the IATA code to set.
     */
    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }
}
