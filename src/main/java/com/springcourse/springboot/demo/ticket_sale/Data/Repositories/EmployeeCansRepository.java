package com.springcourse.springboot.demo.ticket_sale.Data.Repositories;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.EmployeeCans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCansRepository extends JpaRepository<EmployeeCans, Long> {
}
