package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Travel;

import jakarta.persistence.*;

@Entity(name = "travel_types")
public class travel_types {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long transport_type_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String transport_type;
}
