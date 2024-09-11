package com.springcourse.springboot.demo.ticket_sale.Data.Controllers;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Ships.ShipTypes;
import com.springcourse.springboot.demo.ticket_sale.Data.Services.ShipTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ship-types")
public class ShipTypesController {

    @Autowired
    private ShipTypesService shipTypesService;

    @GetMapping
    public List<ShipTypes> getAllShipTypes() {
        return shipTypesService.getAllShipTypes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShipTypes> getShipTypeById(@PathVariable Long id) {
        ShipTypes shipType = shipTypesService.getShipTypeById(id);
        if (shipType != null) {
            return ResponseEntity.ok(shipType);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ShipTypes createShipType(@RequestBody ShipTypes shipType) {
        return shipTypesService.createShipType(shipType);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ShipTypes> updateShipType(@PathVariable Long id, @RequestBody ShipTypes shipType) {
        ShipTypes updatedShipType = shipTypesService.updateShipType(id, shipType);
        if (updatedShipType != null) {
            return ResponseEntity.ok(updatedShipType);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShipType(@PathVariable Long id) {
        shipTypesService.deleteShipType(id);
        return ResponseEntity.noContent().build();
    }
}
