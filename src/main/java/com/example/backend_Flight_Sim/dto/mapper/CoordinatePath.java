package com.example.backend_Flight_Sim.dto.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Represents a path of coordinates.
 */
public class CoordinatePath {
    private List<double[]> path;

    /**
     * Gets the list of coordinates that form the path.
     *
     * @return the list of coordinates as an array of double values.
     */
    @JsonProperty("path")
    public List<double[]> getPath() {
        return path;
    }

    /**
     * Sets the list of coordinates that form the path.
     *
     * @param path the list of coordinates to set, each represented as an array of double values.
     */
    public void setPath(List<double[]> path) {
        this.path = path;
    }
}
