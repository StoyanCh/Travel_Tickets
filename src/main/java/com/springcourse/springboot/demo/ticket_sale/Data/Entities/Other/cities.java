package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "cities")
public class cities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false,nullable = false)
    private Long city_id;
    @Column(length = 10, updatable = false, nullable = false, columnDefinition = "varchar(100)")
    private String city_name;
    @Column(length = 8, updatable = false, nullable = false, columnDefinition = "varchar(8)")
    private String city_postalcode;

    @ManyToMany(mappedBy = "citiesSet")
    private Set<countries> countriesSet;

    public cities(String city_name, String city_postalcode) {
        this.city_name = city_name;
        this.city_postalcode = city_postalcode;
    }

    public cities() {

    }

    public Long getCity_id() {
        return city_id;
    }

    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCity_postalcode() {
        return city_postalcode;
    }

    public void setCity_postalcode(String city_postalcode) {
        this.city_postalcode = city_postalcode;
    }

    public Set<countries> getCountriesSet() {
        return countriesSet;
    }

    public void setCountriesSet(Set<countries> countriesSet) {
        this.countriesSet = countriesSet;
    }
}