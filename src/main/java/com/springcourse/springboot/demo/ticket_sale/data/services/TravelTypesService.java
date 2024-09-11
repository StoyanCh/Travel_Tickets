package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Travel.TransportType;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.TravelTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelTypesService {

    @Autowired
    private TravelTypesRepository travelTypesRepository;

    public List<TransportType> getAllTravelTypes() {
        return travelTypesRepository.findAll();
    }

    public TransportType getTravelTypeById(Long id) {
        return travelTypesRepository.findById(id).orElse(null);
    }

    public TransportType createTravelType(TransportType travelType) {
        return travelTypesRepository.save(travelType);
    }

    public TransportType updateTravelType(Long id, TransportType travelType) {
        if (travelTypesRepository.existsById(id)) {
            travelType.setTransport_type_id(id);
            return travelTypesRepository.save(travelType);
        }
        return null;
    }

    public void deleteTravelType(Long id) {
        travelTypesRepository.deleteById(id);
    }
}
