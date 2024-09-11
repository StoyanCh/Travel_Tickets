package com.springcourse.springboot.demo.ticket_sale.data.entities.Employees;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name = "employee_cans")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeeCans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false,nullable = false)
    private Long employee_can_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String employee_can;

    @ManyToMany(mappedBy = "employeeCans")
    private Set<Employee> employeesSet;
}
