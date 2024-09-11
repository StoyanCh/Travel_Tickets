package com.springcourse.springboot.demo.ticket_sale.data.controllers;

import com.springcourse.springboot.demo.ticket_sale.data.services.BusesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/buses")
public class BusesController {

    @Autowired
    private BusesService busesService;

    @PostMapping("/add")
    public ResponseEntity<String> addBus(
            @RequestParam String vehicleNum,
            @RequestParam Integer agencyId,
            @RequestParam String busRegNum,
            @RequestParam Integer busTypeId,
            @RequestParam Double busAverageSpeed,
            @RequestParam Integer busDriverId) {

        busesService.addBus(vehicleNum, agencyId, busRegNum, busTypeId, busAverageSpeed, busDriverId);
        return new ResponseEntity<>("Bus added successfully", HttpStatus.CREATED);
    }
}
