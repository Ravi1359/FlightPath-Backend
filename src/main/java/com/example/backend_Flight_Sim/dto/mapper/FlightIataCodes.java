package com.example.backend_Flight_Sim.dto.mapper;

public class FlightIataCodes {
    private String departureIataCode;
    private String arrivalIataCode;

    public FlightIataCodes(String departureIataCode, String arrivalIataCode) {
        this.departureIataCode = departureIataCode;
        this.arrivalIataCode = arrivalIataCode;
    }

    // Getters and Setters
    public String getDepartureIataCode() {
        return departureIataCode;
    }

    public void setDepartureIataCode(String departureIataCode) {
        this.departureIataCode = departureIataCode;
    }

    public String getArrivalIataCode() {
        return arrivalIataCode;
    }

    public void setArrivalIataCode(String arrivalIataCode) {
        this.arrivalIataCode = arrivalIataCode;
    }
}

