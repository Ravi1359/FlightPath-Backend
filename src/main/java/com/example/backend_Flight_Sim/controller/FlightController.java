package com.example.backend_Flight_Sim.controller;

import com.example.backend_Flight_Sim.dto.request.FlightDTO;
import com.example.backend_Flight_Sim.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FlightController {

    private final FlightService flightService;

    @Autowired
    public  FlightController(FlightService flightService){
        this.flightService = flightService;
    }

    @PostMapping("/flightPath")
    public String getPathFlight(@RequestBody FlightDTO flightDTO) throws Exception {
        return flightService.findPath(flightDTO);
    }
}
