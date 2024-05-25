package com.example.backend_Flight_Sim.controller;

import com.example.backend_Flight_Sim.dto.request.FlightDTO;
import com.example.backend_Flight_Sim.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for managing flight paths.
 * This controller handles HTTP requests for flight-related operations.
 */
@RestController
@RequestMapping("/api")
public class FlightController {

    private final FlightService flightService;

    /**
     * Constructs a new {@code FlightController} with the specified {@code FlightService}.
     *
     * @param flightService the flight service to be used by this controller.
     */
    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    /**
     * Retrieves the flight path based on the provided flight details.
     * <p>
     * This endpoint handles HTTP POST requests to "/api/flightPath".
     * </p>
     *
     * @param flightDTO the flight details provided in the request body.
     * @return the calculated flight path as a string.
     * @throws Exception if an error occurs while finding the flight path.
     */
    @PostMapping("/flightPath")
    public String getPathFlight(@RequestBody FlightDTO flightDTO) throws Exception {
        return flightService.findPath(flightDTO);
    }
}
