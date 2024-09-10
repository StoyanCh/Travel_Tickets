package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.workplaces;
import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.agencies;
import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "employees")
public class employees {
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
    private employee_positions employee_positions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_agency_id", referencedColumnName = "agency_id", nullable = false)
    private agencies agency;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_workplace_id", referencedColumnName = "workplace_id")
    private workplaces workplace;

    @ManyToMany
    @JoinTable(
            name = "employees_cans_list",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_can_id")
    )
    private Set<employee_cans> employeeCans;

    public employees() {
    }

    public employees(String employee_fname, String employee_sname, String employee_lname, String employee_egn, String employee_idcardnum, String employee_photo, String employee_username, String employee_password, String employee_phone_number, String employee_email, com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.employee_positions employee_positions, agencies agency, workplaces workplace) {
        this.employee_fname = employee_fname;
        this.employee_sname = employee_sname;
        this.employee_lname = employee_lname;
        this.employee_egn = employee_egn;
        this.employee_idcardnum = employee_idcardnum;
        this.employee_photo = employee_photo;
        this.employee_username = employee_username;
        this.employee_password = employee_password;
        this.employee_phone_number = employee_phone_number;
        this.employee_email = employee_email;
        this.employee_positions = employee_positions;
        this.agency = agency;
        this.workplace = workplace;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_fname() {
        return employee_fname;
    }

    public void setEmployee_fname(String employee_fname) {
        this.employee_fname = employee_fname;
    }

    public String getEmployee_sname() {
        return employee_sname;
    }

    public void setEmployee_sname(String employee_sname) {
        this.employee_sname = employee_sname;
    }

    public String getEmployee_lname() {
        return employee_lname;
    }

    public void setEmployee_lname(String employee_lname) {
        this.employee_lname = employee_lname;
    }

    public String getEmployee_egn() {
        return employee_egn;
    }

    public void setEmployee_egn(String employee_egn) {
        this.employee_egn = employee_egn;
    }

    public String getEmployee_idcardnum() {
        return employee_idcardnum;
    }

    public void setEmployee_idcardnum(String employee_idcardnum) {
        this.employee_idcardnum = employee_idcardnum;
    }

    public String getEmployee_photo() {
        return employee_photo;
    }

    public void setEmployee_photo(String employee_photo) {
        this.employee_photo = employee_photo;
    }

    public String getEmployee_username() {
        return employee_username;
    }

    public void setEmployee_username(String employee_username) {
        this.employee_username = employee_username;
    }

    public String getEmployee_password() {
        return employee_password;
    }

    public void setEmployee_password(String employee_password) {
        this.employee_password = employee_password;
    }

    public String getEmployee_phone_number() {
        return employee_phone_number;
    }

    public void setEmployee_phone_number(String employee_phone_number) {
        this.employee_phone_number = employee_phone_number;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.employee_positions getEmployee_positions() {
        return employee_positions;
    }

    public void setEmployee_positions(com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.employee_positions employee_positions) {
        this.employee_positions = employee_positions;
    }

    public agencies getAgency() {
        return agency;
    }

    public void setAgency(agencies agency) {
        this.agency = agency;
    }

    public workplaces getWorkplace() {
        return workplace;
    }

    public void setWorkplace(workplaces workplace) {
        this.workplace = workplace;
    }

    public Set<employee_cans> getEmployeeCans() {
        return employeeCans;
    }

    public void setEmployeeCans(Set<employee_cans> employeeCans) {
        this.employeeCans = employeeCans;
    }
}
