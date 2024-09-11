package com.springcourse.springboot.demo.ticket_sale.data.entities.Other;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
@Entity(name="countries")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long country_id;
    @Column(length = 100, updatable = false, nullable = false, columnDefinition = "varchar(100)")
    private String country_name;
    @Column(length = 20, updatable = false, nullable = false, columnDefinition = "varchar(20)")
    private String country_currency;

    @ManyToMany
    @JoinTable(
            name = "country_cities_list",
            joinColumns = @JoinColumn(name = "country_id"),
            inverseJoinColumns = @JoinColumn(name = "city_id")
    )
    private Set<City> citiesSet;
}