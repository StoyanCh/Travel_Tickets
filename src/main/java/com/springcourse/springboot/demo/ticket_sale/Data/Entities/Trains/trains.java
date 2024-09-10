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

}
