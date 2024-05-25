package com.example.backend_Flight_Sim.controller;

import com.example.backend_Flight_Sim.dto.request.FlightDTO;
import com.example.backend_Flight_Sim.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class for handling flight-related endpoints.
 */
@RestController
@RequestMapping("/api")
public class FlightController {

    private final FlightService flightService;

    /**
     * Constructor injection for FlightController.
     *
     * @param flightService Instance of FlightService to be injected.
     */
    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    /**
     * Endpoint to find the flight path based on the provided FlightDTO.
     *
     * @param flightDTO FlightDTO object containing start and end information.
     * @return JSON string representing the flight path and weather information.
     * @throws Exception If an error occurs during the process.
     */
    @PostMapping("/flightPath")
    public String getPathFlight(@RequestBody FlightDTO flightDTO) throws Exception {
        return flightService.findPath(flightDTO);
    }
}
