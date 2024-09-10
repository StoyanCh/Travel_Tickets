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


}
