package com.springcourse.springboot.demo.ticket_sale.Data.Controllers;

import com.springcourse.springboot.demo.ticket_sale.Data.Services.AirplanesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/airplanes")
public class AirplanesController {

    @Autowired
    private AirplanesService airplanesService;

    @PostMapping("/add")
    public ResponseEntity<String> addAirplane(
            @RequestParam String vehicleNum,
            @RequestParam Integer agencyId,
            @RequestParam String airplaneRegNum,
            @RequestParam Integer airplaneTypeId,
            @RequestParam Double airplaneAverageSpeed,
            @RequestParam Integer airplanesDriver) {

        airplanesService.addAirplane(vehicleNum, agencyId, airplaneRegNum, airplaneTypeId, airplaneAverageSpeed, airplanesDriver);
        return new ResponseEntity<>("Airplane added successfully", HttpStatus.OK);
    }
}
