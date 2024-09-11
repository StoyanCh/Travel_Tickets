package com.springcourse.springboot.demo.ticket_sale.Data.Repositories;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Buses.BusTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusTypesRepository extends JpaRepository<BusTypes, Long> {
}
