package com.springcourse.springboot.demo.ticket_sale.data.repositories;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Buses.BusTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusTypesRepository extends JpaRepository<BusTypes, Long> {
}
