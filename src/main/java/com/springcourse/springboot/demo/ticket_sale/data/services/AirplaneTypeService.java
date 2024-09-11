package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Airplanes.AirplaneTypes;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.AirplaneTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirplaneTypeService {

    private final AirplaneTypeRepository airplaneTypeRepository;

    @Autowired
    public AirplaneTypeService(AirplaneTypeRepository airplaneTypeRepository) {
        this.airplaneTypeRepository = airplaneTypeRepository;
    }

    public List<AirplaneTypes> findAllAirplaneTypes() {
        return airplaneTypeRepository.findAll();
    }

    public Optional<AirplaneTypes> findAirplaneTypeById(Long id) {
        return airplaneTypeRepository.findById(id);
    }

    public AirplaneTypes saveAirplaneType(AirplaneTypes airplaneType) {
        return airplaneTypeRepository.save(airplaneType);
    }

    public void deleteAirplaneType(Long id) {
        airplaneTypeRepository.deleteById(id);
    }
}
