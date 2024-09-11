package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Employees.EmployeePositions;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.EmployeePositionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePositionsService {

    @Autowired
    private EmployeePositionsRepository employeePositionsRepository;

    public List<EmployeePositions> getAllEmployeePositions() {
        return employeePositionsRepository.findAll();
    }

    public Optional<EmployeePositions> getEmployeePositionById(Long id) {
        return employeePositionsRepository.findById(id);
    }

    public EmployeePositions addEmployeePosition(EmployeePositions employeePosition) {
        return employeePositionsRepository.save(employeePosition);
    }

    public EmployeePositions updateEmployeePosition(Long id, EmployeePositions employeePositionDetails) {
        return employeePositionsRepository.findById(id).map(employeePosition -> {
            employeePosition.setEmployee_position(employeePositionDetails.getEmployee_position());
            employeePosition.setEmployee_wage(employeePositionDetails.getEmployee_wage());
            return employeePositionsRepository.save(employeePosition);
        }).orElseThrow(() -> new RuntimeException("Employee position not found"));
    }

    public void deleteEmployeePosition(Long id) {
        employeePositionsRepository.deleteById(id);
    }
}
