package com.example.backend_Flight_Sim.dto.mapper;

import java.util.List;

/**
 * A class representing flight data, including a list of data objects.
 */
public class FlightData {
    private List<Data> data;

    /**
     * Retrieves the list of data objects.
     *
     * @return The list of data objects.
     */
    public List<Data> getData() {
        return data;
    }

    /**
     * Sets the list of data objects.
     *
     * @param data The list of data objects to set.
     */
    public void setData(List<Data> data) {
        this.data = data;
    }
}

