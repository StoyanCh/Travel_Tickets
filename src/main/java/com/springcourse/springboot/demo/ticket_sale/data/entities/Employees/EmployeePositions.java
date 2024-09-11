package com.springcourse.springboot.demo.ticket_sale.data.entities.Employees;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "employee_positions")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeePositions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long employee_position_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String employee_position;

    @Column(nullable = false, columnDefinition = "numeric(6,2)")
    private Double employee_wage;
}
