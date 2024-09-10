package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other;

import jakarta.persistence.*;

@Entity
@Table(name = "agencies")
public class agencies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long agency_id;

    @Column(length = 100, nullable = false)
    private String agency_name;

    @Column(length = 100, nullable = false)
    private String agency_owner;

    @Column(length = 100)
    private String agency_fib;

    public Long getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(Long agency_id) {
        this.agency_id = agency_id;
    }

    public String getAgency_name() {
        return agency_name;
    }

    public void setAgency_name(String agency_name) {
        this.agency_name = agency_name;
    }

    public String getAgency_owner() {
        return agency_owner;
    }

    public void setAgency_owner(String agency_owner) {
        this.agency_owner = agency_owner;
    }

    public String getAgency_fib() {
        return agency_fib;
    }

    public void setAgency_fib(String agency_fib) {
        this.agency_fib = agency_fib;
    }
}
