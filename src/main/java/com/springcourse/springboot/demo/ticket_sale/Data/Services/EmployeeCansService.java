package com.springcourse.springboot.demo.ticket_sale.Data.Services;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.EmployeeCans;
import com.springcourse.springboot.demo.ticket_sale.Data.Repositories.EmployeeCansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeCansService {

    @Autowired
    private EmployeeCansRepository employeeCansRepository;

    public List<EmployeeCans> getAllEmployeeCans() {
        return employeeCansRepository.findAll();
    }

    public Optional<EmployeeCans> getEmployeeCanById(Long id) {
        return employeeCansRepository.findById(id);
    }

    public EmployeeCans addEmployeeCan(EmployeeCans employeeCan) {
        return employeeCansRepository.save(employeeCan);
    }

    public EmployeeCans updateEmployeeCan(Long id, EmployeeCans employeeCanDetails) {
        return employeeCansRepository.findById(id).map(employeeCan -> {
            employeeCan.setEmployee_can(employeeCanDetails.getEmployee_can());
            return employeeCansRepository.save(employeeCan);
        }).orElseThrow(() -> new RuntimeException("Employee can not found"));
    }

    public void deleteEmployeeCan(Long id) {
        employeeCansRepository.deleteById(id);
    }
}
