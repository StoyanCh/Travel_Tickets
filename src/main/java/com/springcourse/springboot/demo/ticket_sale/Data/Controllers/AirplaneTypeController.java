package com.springcourse.springboot.demo.ticket_sale.Data.Controllers;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Airplanes.AirplaneTypes;
import com.springcourse.springboot.demo.ticket_sale.Data.Services.AirplaneTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/airplane-types")
public class AirplaneTypeController {

    private final AirplaneTypeService airplaneTypeService;

    @Autowired
    public AirplaneTypeController(AirplaneTypeService airplaneTypeService) {
        this.airplaneTypeService = airplaneTypeService;
    }

    @GetMapping
    public List<AirplaneTypes> getAllAirplaneTypes() {
        return airplaneTypeService.findAllAirplaneTypes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AirplaneTypes> getAirplaneTypeById(@PathVariable Long id) {
        Optional<AirplaneTypes> airplaneType = airplaneTypeService.findAirplaneTypeById(id);
        return airplaneType.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public AirplaneTypes createAirplaneType(@RequestBody AirplaneTypes airplaneType) {
        return airplaneTypeService.saveAirplaneType(airplaneType);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAirplaneType(@PathVariable Long id) {
        airplaneTypeService.deleteAirplaneType(id);
        return ResponseEntity.noContent().build();
    }
}
