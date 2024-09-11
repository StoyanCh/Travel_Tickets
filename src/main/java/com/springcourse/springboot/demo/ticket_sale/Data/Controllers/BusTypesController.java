package com.springcourse.springboot.demo.ticket_sale.Data.Controllers;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Buses.BusTypes;
import com.springcourse.springboot.demo.ticket_sale.Data.Services.BusTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bus-types")
public class BusTypesController {

    @Autowired
    private BusTypesService busTypesService;

    @GetMapping
    public List<BusTypes> getAllBusTypes() {
        return busTypesService.getAllBusTypes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BusTypes> getBusTypeById(@PathVariable Long id) {
        return busTypesService.getBusTypeById(id)
                .map(ResponseEntity::ok)
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/add")
    public ResponseEntity<BusTypes> addBusType(@RequestBody BusTypes busType) {
        return new ResponseEntity<>(busTypesService.addBusType(busType), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<BusTypes> updateBusType(@PathVariable Long id, @RequestBody BusTypes busTypeDetails) {
        return new ResponseEntity<>(busTypesService.updateBusType(id, busTypeDetails), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBusType(@PathVariable Long id) {
        busTypesService.deleteBusType(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
