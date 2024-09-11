package com.springcourse.springboot.demo.ticket_sale.Data.Services;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.City;
import com.springcourse.springboot.demo.ticket_sale.Data.Repositories.CitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitiesService {

    @Autowired
    private CitiesRepository citiesRepository;

    public List<City> getAllCities() {
        return citiesRepository.findAll();
    }

    public Optional<City> getCityById(Long id) {
        return citiesRepository.findById(id);
    }

    public City addCity(City city) {
        return citiesRepository.save(city);
    }

    public City updateCity(Long id, City cityDetails) {
        return citiesRepository.findById(id).map(city -> {
            city.setCity_name(cityDetails.getCity_name());
            city.setCity_postalcode(cityDetails.getCity_postalcode());
            return citiesRepository.save(city);
        }).orElseThrow(() -> new RuntimeException("City not found"));
    }

    public void deleteCity(Long id) {
        citiesRepository.deleteById(id);
    }
}
