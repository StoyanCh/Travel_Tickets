package com.springcourse.springboot.demo.ticket_sale.data.repositories;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Other.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitiesRepository extends JpaRepository<City, Long> {
}
