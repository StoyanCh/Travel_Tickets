package com.springcourse.springboot.demo.ticket_sale.Data.Services;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Travel.Travel;
import com.springcourse.springboot.demo.ticket_sale.Data.Repositories.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

@Service
public class TravelService {

    private final TravelRepository travelRepository;

    @Autowired
    public TravelService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }

    @Transactional
    public void addTravel(Integer agencyId, Integer agentId, String vehicleNum,
                          Integer departureStationId, Date departureDateTime,
                          Integer arrivalStationId, Date arrivalDateTime,
                          Integer transportTypeId) {
        // Логиката за извикване на процедурата може да бъде реализирана тук
        travelRepository.addTravel(agencyId, agentId, vehicleNum,
                departureStationId, departureDateTime,
                arrivalStationId, arrivalDateTime,
                transportTypeId);
    }

    public Travel createTravel(Travel newTravel) {
        return travelRepository.save(newTravel);
    }



    // Други методи за CRUD операции
}
