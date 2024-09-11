package com.springcourse.springboot.demo.ticket_sale.data.controllers;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Trains.TrainTypes;
import com.springcourse.springboot.demo.ticket_sale.data.services.TrainTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/train-types")
public class TrainTypesController {

    @Autowired
    private TrainTypesService trainTypesService;

    @GetMapping
    public List<TrainTypes> getAllTrainTypes() {
        return trainTypesService.getAllTrainTypes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrainTypes> getTrainTypeById(@PathVariable Long id) {
        TrainTypes trainType = trainTypesService.getTrainTypeById(id);
        if (trainType != null) {
            return ResponseEntity.ok(trainType);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<TrainTypes> createTrainType(@RequestBody TrainTypes trainType) {
        TrainTypes createdTrainType = trainTypesService.createTrainType(trainType);
        return ResponseEntity.created(URI.create("/api/train-types/" + createdTrainType.getTrain_type_id())).body(createdTrainType);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TrainTypes> updateTrainType(@PathVariable Long id, @RequestBody TrainTypes trainType) {
        TrainTypes updatedTrainType = trainTypesService.updateTrainType(id, trainType);
        if (updatedTrainType != null) {
            return ResponseEntity.ok(updatedTrainType);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrainType(@PathVariable Long id) {
        trainTypesService.deleteTrainType(id);
        return ResponseEntity.noContent().build();
    }
}
