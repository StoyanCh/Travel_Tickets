package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.repositories.AirplanesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AirplanesService {

    @Autowired
    private AirplanesRepository airplanesRepository;

    @Transactional
    public void addAirplane(String vehicleNum, Integer agencyId, String airplaneRegNum, Integer airplaneTypeId, Double airplaneAverageSpeed, Integer airplanesDriver) {
        airplanesRepository.addAirplane(vehicleNum, agencyId, airplaneRegNum, airplaneTypeId, airplaneAverageSpeed, airplanesDriver);
    }
}
