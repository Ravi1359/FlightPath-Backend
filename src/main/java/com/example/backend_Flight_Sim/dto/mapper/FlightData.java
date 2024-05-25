package com.example.backend_Flight_Sim.dto.mapper;

import java.util.List;

/**
 * Represents flight data containing a list of data entries.
 */
public class FlightData {
    private List<Data> data;

    /**
     * Gets the list of data entries.
     *
     * @return the list of data entries.
     */
    public List<Data> getData() {
        return data;
    }

    /**
     * Sets the list of data entries.
     *
     * @param data the list of data entries to set.
     */
    public void setData(List<Data> data) {
        this.data = data;
    }
}
