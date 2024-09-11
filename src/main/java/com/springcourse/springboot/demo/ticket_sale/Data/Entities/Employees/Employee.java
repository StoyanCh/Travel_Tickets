package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.Workplace;
import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.Agency;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long employee_id;

    @Column(length = 100, updatable = false, nullable = false, columnDefinition = "varchar(100)")
    private String employee_fname;
    @Column(length = 100, updatable = false, nullable = false, columnDefinition = "varchar(100)")
    private String employee_sname;

    @Column(length = 100, updatable = false, nullable = false, columnDefinition = "varchar(100)")
    private String employee_lname;

    @Column(length = 10, updatable = false, nullable = false, columnDefinition = "varchar(10)")
    private String employee_egn;

    @Column(length = 10, updatable = false, nullable = false, columnDefinition = "varchar(10)")
    private String employee_idcardnum;

    @Column(length = 200, columnDefinition = "varchar(200)")
    private String employee_photo;

    @Column(length = 20, updatable = false, nullable = false, columnDefinition = "varchar(20)")
    private String employee_username;

    @Column(length = 20, updatable = false, nullable = false, columnDefinition = "varchar(20)")
    private String employee_password;

    @Column(length = 15, updatable = false, nullable = false, columnDefinition = "varchar(15)")
    private String employee_phone_number;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String employee_email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_position_id", referencedColumnName = "employee_position_id", nullable = false)
    private EmployeePositions employee_positions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_agency_id", referencedColumnName = "agency_id", nullable = false)
    private Agency agency;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_workplace_id", referencedColumnName = "workplace_id")
    private Workplace workplace;

    @ManyToMany
    @JoinTable(
            name = "employees_cans_list",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_can_id")
    )
    private Set<EmployeeCans> employeeCans;
}