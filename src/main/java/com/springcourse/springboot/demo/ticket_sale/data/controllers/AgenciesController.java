package com.springcourse.springboot.demo.ticket_sale.data.controllers;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Other.Agency;
import com.springcourse.springboot.demo.ticket_sale.data.services.AgenciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agencies")
public class AgenciesController {

    @Autowired
    private AgenciesService agenciesService;

    @GetMapping
    public List<Agency> getAllAgencies() {
        return agenciesService.getAllAgencies();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agency> getAgencyById(@PathVariable Long id) {
        return agenciesService.getAgencyById(id)
                .map(ResponseEntity::ok)
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addAgency(@RequestParam String agencyName, @RequestParam String agencyOwner) {
        agenciesService.addAgency(agencyName, agencyOwner);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Agency> updateAgency(@PathVariable Long id, @RequestBody Agency agencyDetails) {
        return new ResponseEntity<>(agenciesService.updateAgency(id, agencyDetails), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAgency(@PathVariable Long id) {
        agenciesService.deleteAgency(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
