package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "employee_cans")
public class employee_cans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false,nullable = false)
    private Long employee_can_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String employee_can;

    @ManyToMany(mappedBy = "employeeCans")
    private Set<employees> employeesSet;
}
