package com.springcourse.springboot.demo.ticket_sale.data.repositories;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Other.Agency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenciesRepository extends JpaRepository<Agency, Long> {
}
