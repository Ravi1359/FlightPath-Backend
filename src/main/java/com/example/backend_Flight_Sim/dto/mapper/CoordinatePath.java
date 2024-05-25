package com.example.backend_Flight_Sim.dto.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A class representing a coordinate path.
 */
public class CoordinatePath {
    private List<double[]> path;

    /**
     * Retrieves the path of coordinates.
     *
     * @return The list of coordinates representing the path.
     */
    @JsonProperty("path")
    public List<double[]> getPath() {
        return path;
    }

    /**
     * Sets the path of coordinates.
     *
     * @param path The list of coordinates representing the path to set.
     */
    public void setPath(List<double[]> path) {
        this.path = path;
    }
}
