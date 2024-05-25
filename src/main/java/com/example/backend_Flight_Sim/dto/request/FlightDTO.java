package com.example.backend_Flight_Sim.dto.request;

import lombok.Data;
/**
 * Data Transfer Object (DTO) representing a flight request.
 */
@Data
public class FlightDTO {
    /**
     * The starting point of the flight.
     */
    private String start;

    /**
     * The destination of the flight.
     */
    private String end;
}
