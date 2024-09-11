package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name = "cities")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false,nullable = false)
    private Long city_id;
    @Column(length = 10, updatable = false, nullable = false, columnDefinition = "varchar(100)")
    private String city_name;
    @Column(length = 8, updatable = false, nullable = false, columnDefinition = "varchar(8)")
    private String city_postalcode;

    @ManyToMany(mappedBy = "citiesSet")
    private Set<Country> countriesSet;

    public City(String city_name, String city_postalcode) {
        this.city_name = city_name;
        this.city_postalcode = city_postalcode;
    }
}