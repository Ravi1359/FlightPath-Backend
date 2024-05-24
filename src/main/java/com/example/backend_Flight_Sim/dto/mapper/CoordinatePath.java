package com.example.backend_Flight_Sim.dto.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CoordinatePath {
    private List<double[]> path;

    @JsonProperty("path")
    public List<double[]> getPath() {
        return path;
    }

    public void setPath(List<double[]> path) {
        this.path = path;
    }
}

