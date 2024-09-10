package com.springcourse.springboot.demo.ticket_sale.Data.Repositories;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.agencies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenciesRepository extends JpaRepository<agencies, Long> {

    @Procedure(procedureName = "add_agency")
    void addAgency(String p_agency_name, String p_agency_owner);
}
