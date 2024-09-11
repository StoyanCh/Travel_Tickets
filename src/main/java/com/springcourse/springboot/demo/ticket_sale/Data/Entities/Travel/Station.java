package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Travel;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.City;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "stations")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long station_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String station_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", referencedColumnName = "city_id", nullable = false)
    private City city;
}