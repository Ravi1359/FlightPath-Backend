package com.example.backend_Flight_Sim.dto.mapper;

/**
 * Represents flight IATA codes containing departure and arrival IATA codes.
 */
public class FlightIataCodes {
    private String departureIataCode;
    private String arrivalIataCode;

    /**
     * Constructs a new FlightIataCodes object with the given departure and arrival IATA codes.
     *
     * @param departureIataCode the departure IATA code.
     * @param arrivalIataCode   the arrival IATA code.
     */
    public FlightIataCodes(String departureIataCode, String arrivalIataCode) {
        this.departureIataCode = departureIataCode;
        this.arrivalIataCode = arrivalIataCode;
    }

    /**
     * Gets the departure IATA code.
     *
     * @return the departure IATA code.
     */
    public String getDepartureIataCode() {
        return departureIataCode;
    }

    /**
     * Sets the departure IATA code.
     *
     * @param departureIataCode the departure IATA code to set.
     */
    public void setDepartureIataCode(String departureIataCode) {
        this.departureIataCode = departureIataCode;
    }

    /**
     * Gets the arrival IATA code.
     *
     * @return the arrival IATA code.
     */
    public String getArrivalIataCode() {
        return arrivalIataCode;
    }

    /**
     * Sets the arrival IATA code.
     *
     * @param arrivalIataCode the arrival IATA code to set.
     */
    public void setArrivalIataCode(String arrivalIataCode) {
        this.arrivalIataCode = arrivalIataCode;
    }
}
