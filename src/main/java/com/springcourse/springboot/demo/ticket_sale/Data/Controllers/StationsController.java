package com.springcourse.springboot.demo.ticket_sale.Data.Controllers;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Travel.Station;
import com.springcourse.springboot.demo.ticket_sale.Data.Services.StationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/stations")
public class StationsController {

    @Autowired
    private StationsService stationsService;

    @GetMapping
    public List<Station> getAllStations() {
        return stationsService.getAllStations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Station> getStationById(@PathVariable Long id) {
        Station station = stationsService.getStationById(id);
        if (station != null) {
            return ResponseEntity.ok(station);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Void> createStation(@RequestBody Station station) {
        Station createdStation = stationsService.createStation(station);
        return ResponseEntity.created(URI.create("/api/stations/" + createdStation.getStation_id())).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Station> updateStation(@PathVariable Long id, @RequestBody Station station) {
        Station updatedStation = stationsService.updateStation(id, station);
        if (updatedStation != null) {
            return ResponseEntity.ok(updatedStation);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStation(@PathVariable Long id) {
        stationsService.deleteStation(id);
        return ResponseEntity.noContent().build();
    }
}
