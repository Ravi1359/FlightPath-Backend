package com.example.backend_Flight_Sim.dto.mapper;

/**
 * A class representing the IATA codes of departure and arrival airports for a flight.
 */
public class FlightIataCodes {
    private String departureIataCode;
    private String arrivalIataCode;

    /**
     * Constructs a FlightIataCodes object with the given departure and arrival IATA codes.
     *
     * @param departureIataCode The IATA code of the departure airport.
     * @param arrivalIataCode   The IATA code of the arrival airport.
     */
    public FlightIataCodes(String departureIataCode, String arrivalIataCode) {
        this.departureIataCode = departureIataCode;
        this.arrivalIataCode = arrivalIataCode;
    }

    /**
     * Retrieves the IATA code of the departure airport.
     *
     * @return The IATA code of the departure airport.
     */
    public String getDepartureIataCode() {
        return departureIataCode;
    }

    /**
     * Sets the IATA code of the departure airport.
     *
     * @param departureIataCode The IATA code of the departure airport to set.
     */
    public void setDepartureIataCode(String departureIataCode) {
        this.departureIataCode = departureIataCode;
    }

    /**
     * Retrieves the IATA code of the arrival airport.
     *
     * @return The IATA code of the arrival airport.
     */
    public String getArrivalIataCode() {
        return arrivalIataCode;
    }

    /**
     * Sets the IATA code of the arrival airport.
     *
     * @param arrivalIataCode The IATA code of the arrival airport to set.
     */
    public void setArrivalIataCode(String arrivalIataCode) {
        this.arrivalIataCode = arrivalIataCode;
    }
}
