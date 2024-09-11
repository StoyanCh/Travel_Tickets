package com.springcourse.springboot.demo.ticket_sale.Data.Controllers;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Trains.Train;
import com.springcourse.springboot.demo.ticket_sale.Data.Services.TrainsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/trains")
public class TrainsController {

    @Autowired
    private TrainsService trainsService;

    @GetMapping
    public List<Train> getAllTrains() {
        return trainsService.getAllTrains();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Train> getTrainById(@PathVariable Long id) {
        Train train = trainsService.getTrainById(id);
        if (train != null) {
            return ResponseEntity.ok(train);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Void> createTrain(@RequestBody Train train) {
        trainsService.createTrain(train);
        return ResponseEntity.created(URI.create("/api/trains/" + train.getTrain_id())).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Train> updateTrain(@PathVariable Long id, @RequestBody Train train) {
        Train updatedTrain = trainsService.updateTrain(id, train);
        if (updatedTrain != null) {
            return ResponseEntity.ok(updatedTrain);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrain(@PathVariable Long id) {
        trainsService.deleteTrain(id);
        return ResponseEntity.noContent().build();
    }
}
