package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees;

import jakarta.persistence.*;

@Entity(name = "employee_positions")
public class employee_positions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long employee_position_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String employee_position;

    @Column(nullable = false,columnDefinition = "numeric(6,2)")
    private Double employee_wage;
}
