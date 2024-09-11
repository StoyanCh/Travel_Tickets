package com.springcourse.springboot.demo.ticket_sale.Data.Controllers;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Ships.Ship;
import com.springcourse.springboot.demo.ticket_sale.Data.Services.ShipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/ships")
public class ShipsController {

    @Autowired
    private ShipsService shipsService;

    @GetMapping
    public List<Ship> getAllShips() {
        return shipsService.getAllShips();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ship> getShipById(@PathVariable Long id) {
        Ship ship = shipsService.getShipById(id);
        if (ship != null) {
            return ResponseEntity.ok(ship);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Void> createShip(@RequestBody Ship ship) {
        shipsService.createShip(ship);
        return ResponseEntity.created(URI.create("/api/ships/" + ship.getShip_id())).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ship> updateShip(@PathVariable Long id, @RequestBody Ship ship) {
        Ship updatedShip = shipsService.updateShip(id, ship);
        if (updatedShip != null) {
            return ResponseEntity.ok(updatedShip);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShip(@PathVariable Long id) {
        shipsService.deleteShip(id);
        return ResponseEntity.noContent().build();
    }
}
