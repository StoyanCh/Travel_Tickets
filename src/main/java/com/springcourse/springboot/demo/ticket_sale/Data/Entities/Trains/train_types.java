package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Trains;

import jakarta.persistence.*;

@Entity(name = "train_types")
public class train_types {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long train_type_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String train_type;

    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer train_wagon_count;
    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer train_seat_count;


}
