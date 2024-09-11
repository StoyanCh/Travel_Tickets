package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "agencies")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Agency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long agency_id;

    @Column(length = 100, updatable = false, nullable = false, columnDefinition = "varchar(100)")
    private String agency_name;

    @Column(length = 100, updatable = false, nullable = false, columnDefinition = "varchar(100)")
    private String agency_owner;

    @Column(length = 100, updatable = false, nullable = false, columnDefinition = "varchar(100)")
    private String agency_fib;
}