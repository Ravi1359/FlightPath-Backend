package com.example.backend_Flight_Sim.dto.mapper;

import java.util.List;

/**
 * A class representing flight data, including a list of flight points.
 */
public class Data {
    private List<FlightPoint> flightPoints;

    /**
     * Retrieves the list of flight points.
     *
     * @return The list of flight points.
     */
    public List<FlightPoint> getFlightPoints() {
        return flightPoints;
    }

    /**
     * Sets the list of flight points.
     *
     * @param flightPoints The list of flight points to set.
     */
    public void setFlightPoints(List<FlightPoint> flightPoints) {
        this.flightPoints = flightPoints;
    }
}
