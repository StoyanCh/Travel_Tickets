package com.springcourse.springboot.demo.ticket_sale.Data.Controllers;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.EmployeeCans;
import com.springcourse.springboot.demo.ticket_sale.Data.Services.EmployeeCansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee-cans")
public class EmployeeCansController {

    @Autowired
    private EmployeeCansService employeeCansService;

    @GetMapping
    public List<EmployeeCans> getAllEmployeeCans() {
        return employeeCansService.getAllEmployeeCans();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeCans> getEmployeeCanById(@PathVariable Long id) {
        return employeeCansService.getEmployeeCanById(id)
                .map(ResponseEntity::ok)
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/add")
    public ResponseEntity<EmployeeCans> addEmployeeCan(@RequestBody EmployeeCans employeeCan) {
        return new ResponseEntity<>(employeeCansService.addEmployeeCan(employeeCan), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeCans> updateEmployeeCan(@PathVariable Long id, @RequestBody EmployeeCans employeeCanDetails) {
        return new ResponseEntity<>(employeeCansService.updateEmployeeCan(id, employeeCanDetails), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployeeCan(@PathVariable Long id) {
        employeeCansService.deleteEmployeeCan(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
