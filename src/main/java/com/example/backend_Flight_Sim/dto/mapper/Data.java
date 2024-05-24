package com.example.backend_Flight_Sim.dto.mapper;

import java.util.List;

public class Data {
    private List<FlightPoint> flightPoints;

    // Getters and Setters
    public List<FlightPoint> getFlightPoints() {
        return flightPoints;
    }

    public void setFlightPoints(List<FlightPoint> flightPoints) {
        this.flightPoints = flightPoints;
    }
}

