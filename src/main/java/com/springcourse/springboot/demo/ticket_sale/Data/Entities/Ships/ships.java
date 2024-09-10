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

    @Column(updatable = false)
    private Integer ship_max_seats;

    @Column(updatable = false)
    private Integer ship_available_seats;
    @Column(updatable = false)
    private Double ship_average_speed;

    @Column(length = 5 , updatable = false, nullable = false, columnDefinition = "varchar(5)")
    private String speed_metrics;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ship_driver_id", referencedColumnName = "employee_id", nullable = false)
    private employees employee;

}
