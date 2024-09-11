package com.springcourse.springboot.demo.ticket_sale.data.entities.Buses;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "bus_types")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BusTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long bus_type_id;
    @Column(length = 50, updatable = false, nullable = false,columnDefinition = "varchar(50)")
    private String bus_type;
    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer max_available_seats;
}
