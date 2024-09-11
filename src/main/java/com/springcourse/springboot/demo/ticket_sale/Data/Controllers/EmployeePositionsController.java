package com.springcourse.springboot.demo.ticket_sale.Data.Controllers;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.EmployeePositions;
import com.springcourse.springboot.demo.ticket_sale.Data.Services.EmployeePositionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee-positions")
public class EmployeePositionsController {

    @Autowired
    private EmployeePositionsService employeePositionsService;

    @GetMapping
    public List<EmployeePositions> getAllEmployeePositions() {
        return employeePositionsService.getAllEmployeePositions();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeePositions> getEmployeePositionById(@PathVariable Long id) {
        return employeePositionsService.getEmployeePositionById(id)
                .map(ResponseEntity::ok)
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/add")
    public ResponseEntity<EmployeePositions> addEmployeePosition(@RequestBody EmployeePositions employeePosition) {
        return new ResponseEntity<>(employeePositionsService.addEmployeePosition(employeePosition), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeePositions> updateEmployeePosition(@PathVariable Long id, @RequestBody EmployeePositions employeePositionDetails) {
        return new ResponseEntity<>(employeePositionsService.updateEmployeePosition(id, employeePositionDetails), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployeePosition(@PathVariable Long id) {
        employeePositionsService.deleteEmployeePosition(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
