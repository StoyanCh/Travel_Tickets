package com.springcourse.springboot.demo.ticket_sale.data.repositories;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Employees.EmployeeCans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCansRepository extends JpaRepository<EmployeeCans, Long> {
}
