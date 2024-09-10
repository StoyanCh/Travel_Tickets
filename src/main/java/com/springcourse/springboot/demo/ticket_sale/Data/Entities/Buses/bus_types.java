package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Buses;

import jakarta.persistence.*;

@Entity(name = "bus_types")
public class bus_types {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long bus_type_id;
    @Column(length = 50, updatable = false, nullable = false,columnDefinition = "varchar(50)")
    private String bus_type;
    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private String max_available_seats;
}
