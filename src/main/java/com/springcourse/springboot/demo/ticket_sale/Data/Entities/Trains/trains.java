package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Trains;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.employees;
import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.agencies;
import jakarta.persistence.*;

@Entity(name = "trains")
public class trains {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long train_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String vehicle_num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agency_id", referencedColumnName = "agency_id", nullable = false)
    private agencies agency;

    @Column(length = 8, updatable = false, nullable = false, columnDefinition = "varchar(8)")
    private String train_reg_num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "train_type", referencedColumnName = "train_type_id", nullable = false)
    private train_types trainTypes;

    @Column(updatable = false)
    private Integer train_max_seats;

    @Column(updatable = false)
    private Integer train_available_seats;
    @Column(updatable = false)
    private Double train_average_speed;

    @Column(length = 5 , updatable = false, nullable = false, columnDefinition = "varchar(5)")
    private String speed_metrics;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "train_driver_id", referencedColumnName = "employee_id", nullable = false)
    private employees employee;

    public trains() {
    }

    public trains(String vehicle_num, agencies agency, String train_reg_num, train_types trainTypes, Integer train_max_seats, Integer train_available_seats, Double train_average_speed, String speed_metrics, employees employee) {
        this.vehicle_num = vehicle_num;
        this.agency = agency;
        this.train_reg_num = train_reg_num;
        this.trainTypes = trainTypes;
        this.train_max_seats = train_max_seats;
        this.train_available_seats = train_available_seats;
        this.train_average_speed = train_average_speed;
        this.speed_metrics = speed_metrics;
        this.employee = employee;
    }

    public Long getTrain_id() {
        return train_id;
    }

    public void setTrain_id(Long train_id) {
        this.train_id = train_id;
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

    public String getTrain_reg_num() {
        return train_reg_num;
    }

    public void setTrain_reg_num(String train_reg_num) {
        this.train_reg_num = train_reg_num;
    }

    public train_types getTrainTypes() {
        return trainTypes;
    }

    public void setTrainTypes(train_types trainTypes) {
        this.trainTypes = trainTypes;
    }

    public Integer getTrain_max_seats() {
        return train_max_seats;
    }

    public void setTrain_max_seats(Integer train_max_seats) {
        this.train_max_seats = train_max_seats;
    }

    public Integer getTrain_available_seats() {
        return train_available_seats;
    }

    public void setTrain_available_seats(Integer train_available_seats) {
        this.train_available_seats = train_available_seats;
    }

    public Double getTrain_average_speed() {
        return train_average_speed;
    }

    public void setTrain_average_speed(Double train_average_speed) {
        this.train_average_speed = train_average_speed;
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
