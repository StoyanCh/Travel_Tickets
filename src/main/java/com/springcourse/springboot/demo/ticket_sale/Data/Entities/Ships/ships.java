package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Ships;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.employees;
import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.agencies;
import jakarta.persistence.*;

@Entity(name = "ships")
public class ships {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long ship_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String vehicle_num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agency_id", referencedColumnName = "agency_id", nullable = false)
    private agencies agency;

    @Column(length = 8 , updatable = false, nullable = false, columnDefinition = "varchar(8)")
    private String ship_gen_number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ship_type_id", referencedColumnName = "ship_type_id")
    private ship_types shipTypes;

    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer ship_max_seats;

    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer ship_available_seats;
    @Column(updatable = false, nullable = false, columnDefinition = "Numeric")
    private Double ship_average_speed;

    @Column(length = 5 , updatable = false, nullable = false, columnDefinition = "varchar(5)")
    private String speed_metrics;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ship_driver_id", referencedColumnName = "employee_id", nullable = false)
    private employees employee;

    public ships() {
    }

    public ships(String vehicle_num, agencies agency, String ship_gen_number, ship_types shipTypes, Integer ship_max_seats, Integer ship_available_seats, Double ship_average_speed, String speed_metrics, employees employee) {
        this.vehicle_num = vehicle_num;
        this.agency = agency;
        this.ship_gen_number = ship_gen_number;
        this.shipTypes = shipTypes;
        this.ship_max_seats = ship_max_seats;
        this.ship_available_seats = ship_available_seats;
        this.ship_average_speed = ship_average_speed;
        this.speed_metrics = speed_metrics;
        this.employee = employee;
    }

    public Long getShip_id() {
        return ship_id;
    }

    public void setShip_id(Long ship_id) {
        this.ship_id = ship_id;
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

    public String getShip_gen_number() {
        return ship_gen_number;
    }

    public void setShip_gen_number(String ship_gen_number) {
        this.ship_gen_number = ship_gen_number;
    }

    public ship_types getShipTypes() {
        return shipTypes;
    }

    public void setShipTypes(ship_types shipTypes) {
        this.shipTypes = shipTypes;
    }

    public Integer getShip_max_seats() {
        return ship_max_seats;
    }

    public void setShip_max_seats(Integer ship_max_seats) {
        this.ship_max_seats = ship_max_seats;
    }

    public Integer getShip_available_seats() {
        return ship_available_seats;
    }

    public void setShip_available_seats(Integer ship_available_seats) {
        this.ship_available_seats = ship_available_seats;
    }

    public Double getShip_average_speed() {
        return ship_average_speed;
    }

    public void setShip_average_speed(Double ship_average_speed) {
        this.ship_average_speed = ship_average_speed;
    }

    public String getSpeed_metrics() {
        return speed_metrics;
    }

    public void setSpeed_metrics(String speed_metrics) {
        this.speed_metrics = speed_metrics;
    }

    public employees getEmployee() {
        return employee;
    }

    public void setEmployee(employees employee) {
        this.employee = employee;
    }
}
