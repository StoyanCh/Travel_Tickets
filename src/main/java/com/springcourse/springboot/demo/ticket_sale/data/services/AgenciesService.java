package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Other.Agency;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.AgenciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgenciesService {

    @Autowired
    private AgenciesRepository agenciesRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate; // за извикване на процедурата

    public List<Agency> getAllAgencies() {
        return agenciesRepository.findAll();
    }

    public Optional<Agency> getAgencyById(Long id) {
        return agenciesRepository.findById(id);
    }

    // Извикване на процедурата за добавяне на агенция
    public void addAgency(String agencyName, String agencyOwner) {
        String sql = "CALL add_agency(?, ?)"; // извикване на процедурата
        jdbcTemplate.update(sql, agencyName, agencyOwner);
    }

    public Agency updateAgency(Long id, Agency agencyDetails) {
        return agenciesRepository.findById(id).map(agency -> {
            agency.setAgency_name(agencyDetails.getAgency_name());
            agency.setAgency_owner(agencyDetails.getAgency_owner());
            agency.setAgency_fib(agencyDetails.getAgency_fib());
            return agenciesRepository.save(agency);
        }).orElseThrow(() -> new RuntimeException("Agency not found"));
    }

    public void deleteAgency(Long id) {
        agenciesRepository.deleteById(id);
    }
}
