package com.example.backend_Flight_Sim.dto.mapper;

import java.util.List;

/**
 * Represents data containing a list of flight points.
 */
public class Data {
    private List<FlightPoint> flightPoints;

    /**
     * Gets the list of flight points.
     *
     * @return the list of flight points.
     */
    public List<FlightPoint> getFlightPoints() {
        return flightPoints;
    }

    /**
     * Sets the list of flight points.
     *
     * @param flightPoints the list of flight points to set.
     */
    public void setFlightPoints(List<FlightPoint> flightPoints) {
        this.flightPoints = flightPoints;
    }
}
