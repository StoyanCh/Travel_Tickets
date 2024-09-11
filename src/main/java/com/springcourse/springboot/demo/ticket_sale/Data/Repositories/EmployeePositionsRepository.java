package com.springcourse.springboot.demo.ticket_sale.Data.Repositories;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.EmployeePositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePositionsRepository extends JpaRepository<EmployeePositions, Long> {
}
