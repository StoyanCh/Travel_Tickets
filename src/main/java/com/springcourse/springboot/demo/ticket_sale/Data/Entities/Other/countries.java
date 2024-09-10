package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other;

import jakarta.persistence.*;
import java.util.Set;
@Entity(name="countries")
public class countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false,nullable = false)
    private Long country_id;
    @Column(length = 100, updatable = false, nullable = false,columnDefinition = "varchar(100)")
    private String country_name;
    @Column(length = 20, updatable = false, nullable = false,columnDefinition = "varchar(20)")
    private String country_currency;

    @ManyToMany
    @JoinTable(
            name = "country_cities_list",
            joinColumns = @JoinColumn(name = "country_id"),
            inverseJoinColumns = @JoinColumn(name = "city_id")
    )
    private Set<cities> citiesSet;

    public countries(){

    }
    public countries(String country_name, String country_currency) {
        this.country_name = country_name;
        this.country_currency = country_currency;
    }

    public Long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Long country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_currency() {
        return country_currency;
    }

    public void setCountry_currency(String country_currency) {
        this.country_currency = country_currency;
    }

    public Set<cities> getCitiesSet() {
        return citiesSet;
    }

    public void setCitiesSet(Set<cities> citiesSet) {
        this.citiesSet = citiesSet;
    }
}
