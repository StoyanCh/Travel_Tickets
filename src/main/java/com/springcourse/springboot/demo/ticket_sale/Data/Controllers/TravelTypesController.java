package com.springcourse.springboot.demo.ticket_sale.Data.Controllers;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Travel.TransportType;
import com.springcourse.springboot.demo.ticket_sale.Data.Services.TravelTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/travel-types")
public class TravelTypesController {

    @Autowired
    private TravelTypesService travelTypesService;

    @GetMapping
    public List<TransportType> getAllTravelTypes() {
        return travelTypesService.getAllTravelTypes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransportType> getTravelTypeById(@PathVariable Long id) {
        TransportType travelType = travelTypesService.getTravelTypeById(id);
        if (travelType != null) {
            return ResponseEntity.ok(travelType);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Void> createTravelType(@RequestBody TransportType travelType) {
        TransportType createdTravelType = travelTypesService.createTravelType(travelType);
        return ResponseEntity.created(URI.create("/api/travel-types/" + createdTravelType.getTransport_type_id())).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<TransportType> updateTravelType(@PathVariable Long id, @RequestBody TransportType travelType) {
        TransportType updatedTravelType = travelTypesService.updateTravelType(id, travelType);
        if (updatedTravelType != null) {
            return ResponseEntity.ok(updatedTravelType);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTravelType(@PathVariable Long id) {
        travelTypesService.deleteTravelType(id);
        return ResponseEntity.noContent().build();
    }
}
