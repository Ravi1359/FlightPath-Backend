package com.example.backend_Flight_Sim.dto.request;

import lombok.Data;

/**
 * Data Transfer Object (DTO) representing a flight request.
 */
@Data
public class FlightDTO {
    /**
     * The starting point or departure IATA code of the flight.
     */
    private String start;

    /**
     * The destination or arrival IATA code of the flight.
     */
    private String end;
}
