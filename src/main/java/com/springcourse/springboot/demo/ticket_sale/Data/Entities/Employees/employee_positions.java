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

    public employee_positions() {
    }

    public employee_positions(String employee_position, Double employee_wage) {
        this.employee_position = employee_position;
        this.employee_wage = employee_wage;
    }

    public Long getEmployee_position_id() {
        return employee_position_id;
    }

    public void setEmployee_position_id(Long employee_position_id) {
        this.employee_position_id = employee_position_id;
    }

    public String getEmployee_position() {
        return employee_position;
    }

    public void setEmployee_position(String employee_position) {
        this.employee_position = employee_position;
    }

    public Double getEmployee_wage() {
        return employee_wage;
    }

    public void setEmployee_wage(Double employee_wage) {
        this.employee_wage = employee_wage;
    }
}
