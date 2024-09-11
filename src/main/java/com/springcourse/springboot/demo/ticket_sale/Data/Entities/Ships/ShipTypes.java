package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Ships;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "ship_types")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ShipTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long ship_type_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String ship_type;

    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer ship_first_clas_seats;
    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer ship_second_clas_seats;

    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer ship_normal_clas_seats;
}