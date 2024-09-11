package com.springcourse.springboot.demo.ticket_sale.Data.Services;

import com.springcourse.springboot.demo.ticket_sale.Data.Repositories.BusesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusesService {

    @Autowired
    private BusesRepository busesRepository;

    public void addBus(String vehicleNum, Integer agencyId, String busRegNum, Integer busTypeId, Double busAverageSpeed, Integer busDriverId) {
        busesRepository.addBus(vehicleNum, agencyId, busRegNum, busTypeId, busAverageSpeed, busDriverId);
    }
}
