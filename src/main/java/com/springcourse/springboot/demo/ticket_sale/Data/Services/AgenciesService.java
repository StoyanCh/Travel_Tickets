package com.springcourse.springboot.demo.ticket_sale.Data.Services;

import com.springcourse.springboot.demo.ticket_sale.Data.Repositories.AgenciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgenciesService {

    @Autowired
    private AgenciesRepository agenciesRepository;

    public void addNewAgency(String agencyName, String agencyOwner) {
        agenciesRepository.addAgency(agencyName, agencyOwner);
    }
}
