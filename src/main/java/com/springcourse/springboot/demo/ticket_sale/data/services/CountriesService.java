package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Other.Country;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountriesService {

    @Autowired
    private CountriesRepository countriesRepository;

    public List<Country> getAllCountries() {
        return countriesRepository.findAll();
    }

    public Optional<Country> getCountryById(Long id) {
        return countriesRepository.findById(id);
    }

    public Country addCountry(Country country) {
        return countriesRepository.save(country);
    }

    public Country updateCountry(Long id, Country countryDetails) {
        return countriesRepository.findById(id).map(country -> {
            country.setCountry_name(countryDetails.getCountry_name());
            country.setCountry_currency(countryDetails.getCountry_currency());
            return countriesRepository.save(country);
        }).orElseThrow(() -> new RuntimeException("Country not found"));
    }

    public void deleteCountry(Long id) {
        countriesRepository.deleteById(id);
    }
}
