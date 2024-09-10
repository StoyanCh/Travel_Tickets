package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Airplanes;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.employees;
import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.agencies;
import jakarta.persistence.*;

@Entity(name = "airplanes")
public class airplanes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long airplane_id;
    @Column(length = 50, updatable = false, nullable = false,columnDefinition = "varchar(50)")
    private String vehicle_num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agency_id", referencedColumnName = "agency_id")
    private agencies agency;

    @Column(length = 50, updatable = false, nullable = false,columnDefinition = "varchar(50)")
    private String airplane_reh_num;
    @ManyToOne
    @JoinColumn(name = "airplane_type_id", referencedColumnName = "airplane_type_id")
    private airplane_types airplaneTypes;
    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer airplane_available_seats;

    @Column(updatable = false, nullable = false, columnDefinition = "Numeric")
    private Double airplane_average_speed;
    @Column(length = 5,updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String speed_metrics;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airplanes_driver", referencedColumnName = "employee_id")
    private employees airplanes_driver;

    public airplanes() {
    }

    public airplanes(String vehicle_num, agencies agency, String airplane_reh_num, airplane_types airplaneTypes, Integer airplane_available_seats, Double airplane_average_speed, String speed_metrics, employees airplanes_driver) {
        this.vehicle_num = vehicle_num;
        this.agency = agency;
        this.airplane_reh_num = airplane_reh_num;
        this.airplaneTypes = airplaneTypes;
        this.airplane_available_seats = airplane_available_seats;
        this.airplane_average_speed = airplane_average_speed;
        this.speed_metrics = speed_metrics;
        this.airplanes_driver = airplanes_driver;
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

    public String getAirplane_reh_num() {
        return airplane_reh_num;
    }

    public void setAirplane_reh_num(String airplane_reh_num) {
        this.airplane_reh_num = airplane_reh_num;
    }

    public airplane_types getAirplaneTypes() {
        return airplaneTypes;
    }

    public void setAirplaneTypes(airplane_types airplaneTypes) {
        this.airplaneTypes = airplaneTypes;
    }

    public Integer getAirplane_available_seats() {
        return airplane_available_seats;
    }

    public void setAirplane_available_seats(Integer airplane_available_seats) {
        this.airplane_available_seats = airplane_available_seats;
    }

    public Double getAirplane_average_speed() {
        return airplane_average_speed;
    }

    public void setAirplane_average_speed(Double airplane_average_speed) {
        this.airplane_average_speed = airplane_average_speed;
    }

    public String getSpeed_metrics() {
        return speed_metrics;
    }

    public void setSpeed_metrics(String speed_metrics) {
        this.speed_metrics = speed_metrics;
    }

    public employees getAirplanes_driver() {
        return airplanes_driver;
    }

    public void setAirplanes_driver(employees airplanes_driver) {
        this.airplanes_driver = airplanes_driver;
    }
}
