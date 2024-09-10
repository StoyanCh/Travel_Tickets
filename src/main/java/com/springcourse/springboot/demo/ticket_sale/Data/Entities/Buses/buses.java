package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Buses;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.employees;
import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.agencies;
import jakarta.persistence.*;

@Entity(name = "buses")
public class buses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long bus_id;
    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String vehicle_num;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agency_id", referencedColumnName = "agency_id")
    private agencies agency;
    @Column(length = 8, updatable = false, nullable = false, columnDefinition = "varchar(8)")
    private String bus_reg_num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_type_id", referencedColumnName = "bus_type_id")
    private bus_types busType;
    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer bus_max_seats;

    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer bus_available_seats;
    @Column(updatable = false, nullable = false, columnDefinition = "Numeric")
    private Double bus_average_speed;
    @Column(length = 4, updatable = false, nullable = false, columnDefinition = "varchar(4)")
    private String speed_metrics;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_driver_id", referencedColumnName = "employee_id")
    private employees bus_driver;

    public buses() {
    }

    public buses(String vehicle_num, agencies agency, String bus_reg_num, bus_types busType, Integer bus_max_seats, Integer bus_available_seats, Double bus_average_speed, String speed_metrics, employees bus_driver) {
        this.vehicle_num = vehicle_num;
        this.agency = agency;
        this.bus_reg_num = bus_reg_num;
        this.busType = busType;
        this.bus_max_seats = bus_max_seats;
        this.bus_available_seats = bus_available_seats;
        this.bus_average_speed = bus_average_speed;
        this.speed_metrics = speed_metrics;
        this.bus_driver = bus_driver;
    }

    public String getVehicle_num() {
        return vehicle_num;
    }

    public void setVehicle_num(String vehicle_num) {
        this.vehicle_num = vehicle_num;
    }

    public agencies getAgency() {
        return agency;
    }

    public void setAgency(agencies agency) {
        this.agency = agency;
    }

    public String getBus_reg_num() {
        return bus_reg_num;
    }

    public void setBus_reg_num(String bus_reg_num) {
        this.bus_reg_num = bus_reg_num;
    }

    public bus_types getBusType() {
        return busType;
    }

    public void setBusType(bus_types busType) {
        this.busType = busType;
    }

    public Integer getBus_max_seats() {
        return bus_max_seats;
    }

    public void setBus_max_seats(Integer bus_max_seats) {
        this.bus_max_seats = bus_max_seats;
    }

    public Integer getBus_available_seats() {
        return bus_available_seats;
    }

    public void setBus_available_seats(Integer bus_available_seats) {
        this.bus_available_seats = bus_available_seats;
    }

    public Double getBus_average_speed() {
        return bus_average_speed;
    }

    public void setBus_average_speed(Double bus_average_speed) {
        this.bus_average_speed = bus_average_speed;
    }

    public String getSpeed_metrics() {
        return speed_metrics;
    }

    public void setSpeed_metrics(String speed_metrics) {
        this.speed_metrics = speed_metrics;
    }

    public employees getBus_driver() {
        return bus_driver;
    }

    public void setBus_driver(employees bus_driver) {
        this.bus_driver = bus_driver;
    }
}
