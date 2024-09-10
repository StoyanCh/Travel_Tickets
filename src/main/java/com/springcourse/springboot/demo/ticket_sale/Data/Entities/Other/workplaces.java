package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other;

import jakarta.persistence.*;

@Entity(name = "workplaces")
public class workplaces {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long workplace_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String workplace_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workplace_city_id", referencedColumnName = "city_id", nullable = false)
    private cities city;

    @Column(length = 100, updatable = false, nullable = false, columnDefinition = "varchar(100)")
    private String workplace_address;

    @Column(length = 10, updatable = false, nullable = false, columnDefinition = "varchar(10)")
    private String workplace_phone_number;

    @Column(length = 100, updatable = false, nullable = false, columnDefinition = "varchar(100)")
    private String workplace_email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workplace_owneragency_id", referencedColumnName = "agency_id", nullable = false)
    private agencies agency;

    @Column(length = 5,updatable = false, nullable = false, columnDefinition = "varchar(5) default '00:00'")
    private String schedule_mtof_from;
    @Column(length = 5, updatable = false, nullable = false, columnDefinition = "varchar(5) default '23:59'")
    private String schedule_mtof_to;
    @Column(length = 5, updatable = false, nullable = false, columnDefinition = "varchar(5) default '00:00'")
    private String schedule_sattosun_from;
    @Column(length = 5, updatable = false, nullable = false, columnDefinition = "varchar(5) default '23:59'")
    private String schedule_sattosun_to;
    @Column(length = 5, updatable = false, nullable = false, columnDefinition = "varchar(5) default '00:00'")
    private String schedule_holidays_from;
    @Column(length = 5, updatable = false, nullable = false, columnDefinition = "varchar(5) default '17:00'")
    private String schedule_holidays_to;

    public workplaces() {
    }

    public workplaces(String workplace_name, cities city, String workplace_address, String workplace_phone_number, String workplace_email, agencies agency, String schedule_mtof_from, String schedule_mtof_to, String schedule_sattosun_from, String schedule_sattosun_to, String schedule_holidays_from, String schedule_holidays_to) {
        this.workplace_name = workplace_name;
        this.city = city;
        this.workplace_address = workplace_address;
        this.workplace_phone_number = workplace_phone_number;
        this.workplace_email = workplace_email;
        this.agency = agency;
        this.schedule_mtof_from = schedule_mtof_from;
        this.schedule_mtof_to = schedule_mtof_to;
        this.schedule_sattosun_from = schedule_sattosun_from;
        this.schedule_sattosun_to = schedule_sattosun_to;
        this.schedule_holidays_from = schedule_holidays_from;
        this.schedule_holidays_to = schedule_holidays_to;
    }

    public Long getWorkplace_id() {
        return workplace_id;
    }

    public void setWorkplace_id(Long workplace_id) {
        this.workplace_id = workplace_id;
    }

    public String getWorkplace_name() {
        return workplace_name;
    }

    public void setWorkplace_name(String workplace_name) {
        this.workplace_name = workplace_name;
    }

    public cities getCity() {
        return city;
    }

    public void setCity(cities city) {
        this.city = city;
    }

    public String getWorkplace_address() {
        return workplace_address;
    }

    public void setWorkplace_address(String workplace_address) {
        this.workplace_address = workplace_address;
    }

    public String getWorkplace_phone_number() {
        return workplace_phone_number;
    }

    public void setWorkplace_phone_number(String workplace_phone_number) {
        this.workplace_phone_number = workplace_phone_number;
    }

    public String getWorkplace_email() {
        return workplace_email;
    }

    public void setWorkplace_email(String workplace_email) {
        this.workplace_email = workplace_email;
    }

    public agencies getAgency() {
        return agency;
    }

    public void setAgency(agencies agency) {
        this.agency = agency;
    }

    public String getSchedule_mtof_from() {
        return schedule_mtof_from;
    }

    public void setSchedule_mtof_from(String schedule_mtof_from) {
        this.schedule_mtof_from = schedule_mtof_from;
    }

    public String getSchedule_mtof_to() {
        return schedule_mtof_to;
    }

    public void setSchedule_mtof_to(String schedule_mtof_to) {
        this.schedule_mtof_to = schedule_mtof_to;
    }

    public String getSchedule_sattosun_from() {
        return schedule_sattosun_from;
    }

    public void setSchedule_sattosun_from(String schedule_sattosun_from) {
        this.schedule_sattosun_from = schedule_sattosun_from;
    }

    public String getSchedule_sattosun_to() {
        return schedule_sattosun_to;
    }

    public void setSchedule_sattosun_to(String schedule_sattosun_to) {
        this.schedule_sattosun_to = schedule_sattosun_to;
    }

    public String getSchedule_holidays_from() {
        return schedule_holidays_from;
    }

    public void setSchedule_holidays_from(String schedule_holidays_from) {
        this.schedule_holidays_from = schedule_holidays_from;
    }

    public String getSchedule_holidays_to() {
        return schedule_holidays_to;
    }

    public void setSchedule_holidays_to(String schedule_holidays_to) {
        this.schedule_holidays_to = schedule_holidays_to;
    }
}
