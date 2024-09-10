package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Travel;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.employees;
import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.agencies;
import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "travels")
public class travels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long travel_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "travel_agency_id", referencedColumnName = "agency_id")
    private agencies agency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "travel_agent_organizer_id", referencedColumnName = "employee_id", nullable = false)
    private employees employee;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String vehicle_num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departure_station_id", referencedColumnName = "station_id", nullable = false)
    private stations departure_station;

    @Column(updatable = false, nullable = false, columnDefinition = "date")
    private Date departure_date_time;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "arrival_station_id", referencedColumnName = "station_id", nullable = false)
    private stations arrival_station;

    @Column(updatable = false, nullable = false, columnDefinition = "date")
    private Date arrival_date_time;

    @Column(nullable = false, columnDefinition = "boolean")
    private Boolean available;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "transport_type_id", referencedColumnName = "transport_type_id", nullable = false)
    private travel_types travelTypes;

}
