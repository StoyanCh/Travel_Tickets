package com.springcourse.springboot.demo.ticket_sale.Data.Repositories;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.Agency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenciesRepository extends JpaRepository<Agency, Long> {
}
