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

    public employee_cans() {
    }

    public employee_cans(String employee_can) {
        this.employee_can = employee_can;
    }

    public Long getEmployee_can_id() {
        return employee_can_id;
    }

    public void setEmployee_can_id(Long employee_can_id) {
        this.employee_can_id = employee_can_id;
    }

    public String getEmployee_can() {
        return employee_can;
    }

    public void setEmployee_can(String employee_can) {
        this.employee_can = employee_can;
    }

    public Set<employees> getEmployeesSet() {
        return employeesSet;
    }

    public void setEmployeesSet(Set<employees> employeesSet) {
        this.employeesSet = employeesSet;
    }
}
