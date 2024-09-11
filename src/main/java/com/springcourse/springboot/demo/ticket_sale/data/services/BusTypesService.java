package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Buses.BusTypes;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.BusTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusTypesService {

    @Autowired
    private BusTypesRepository busTypesRepository;

    public List<BusTypes> getAllBusTypes() {
        return busTypesRepository.findAll();
    }

    public Optional<BusTypes> getBusTypeById(Long id) {
        return busTypesRepository.findById(id);
    }

    public BusTypes addBusType(BusTypes busType) {
        return busTypesRepository.save(busType);
    }

    public BusTypes updateBusType(Long id, BusTypes busTypeDetails) {
        return busTypesRepository.findById(id).map(busType -> {
            busType.setBus_type(busTypeDetails.getBus_type());
            busType.setMax_available_seats(busTypeDetails.getMax_available_seats());
            return busTypesRepository.save(busType);
        }).orElseThrow(() -> new RuntimeException("Bus type not found"));
    }

    public void deleteBusType(Long id) {
        busTypesRepository.deleteById(id);
    }
}
