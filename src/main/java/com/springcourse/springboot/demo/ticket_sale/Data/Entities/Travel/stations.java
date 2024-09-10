package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Travel;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.cities;
import jakarta.persistence.*;

@Entity(name = "stations")
public class stations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long station_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String station_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", referencedColumnName = "city_id", nullable = false)
    private cities city;

}
