package com.springcourse.springboot.demo.ticket_sale.data.controllers;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Employees.Employee;
import com.springcourse.springboot.demo.ticket_sale.data.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeesService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return employeesService.getEmployeeById(id)
                .map(ResponseEntity::ok)
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addEmployee(@RequestParam String fname, @RequestParam String sname,
                                            @RequestParam String lname, @RequestParam String egn,
                                            @RequestParam String idcardnum, @RequestParam String photo,
                                            @RequestParam String username, @RequestParam String password,
                                            @RequestParam String phoneNumber, @RequestParam String email,
                                            @RequestParam Long positionId, @RequestParam Long agencyId,
                                            @RequestParam Long workplaceId) {
        employeesService.addEmployee(fname, sname, lname, egn, idcardnum, photo, username, password,
                phoneNumber, email, positionId, agencyId, workplaceId);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        return new ResponseEntity<>(employeesService.updateEmployee(id, employeeDetails), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeesService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
