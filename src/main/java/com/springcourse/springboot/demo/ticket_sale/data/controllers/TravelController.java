package com.springcourse.springboot.demo.ticket_sale.data.controllers;

import com.springcourse.springboot.demo.ticket_sale.data.services.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/travels")
public class TravelController {

    private final TravelService travelService;

    @Autowired
    public TravelController(TravelService travelService) {
        this.travelService = travelService;
    }

    @PostMapping
    public ResponseEntity<String> createTravel(@RequestParam Integer agencyId,
                                               @RequestParam Integer agentId,
                                               @RequestParam String vehicleNum,
                                               @RequestParam Integer departureStationId,
                                               @RequestParam Date departureDateTime,
                                               @RequestParam Integer arrivalStationId,
                                               @RequestParam Date arrivalDateTime,
                                               @RequestParam Integer transportTypeId) {
        try {
            travelService.addTravel(agencyId, agentId, vehicleNum,
                    departureStationId, (java.sql.Date) departureDateTime,
                    arrivalStationId, (java.sql.Date) arrivalDateTime,
                    transportTypeId);
            return new ResponseEntity<>("Travel created successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error creating travel: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Други методи за CRUD операции
}
