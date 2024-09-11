package com.springcourse.springboot.demo.ticket_sale.data.controllers;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Other.Workplace;
import com.springcourse.springboot.demo.ticket_sale.data.services.WorkplacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workplaces")
public class WorkplacesController {

    @Autowired
    private WorkplacesService workplacesService;

    @GetMapping
    public List<Workplace> getAllWorkplaces() {
        return workplacesService.getAllWorkplaces();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Workplace> getWorkplaceById(@PathVariable Long id) {
        Workplace workplace = workplacesService.getWorkplaceById(id);
        if (workplace != null) {
            return ResponseEntity.ok(workplace);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Workplace createWorkplace(@RequestBody Workplace workplace) {
        return workplacesService.createWorkplace(workplace);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Workplace> updateWorkplace(@PathVariable Long id, @RequestBody Workplace workplace) {
        Workplace updatedWorkplace = workplacesService.updateWorkplace(id, workplace);
        if (updatedWorkplace != null) {
            return ResponseEntity.ok(updatedWorkplace);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkplace(@PathVariable Long id) {
        workplacesService.deleteWorkplace(id);
        return ResponseEntity.noContent().build();
    }
}
