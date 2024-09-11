package com.springcourse.springboot.demo.ticket_sale.Data.Repositories;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitiesRepository extends JpaRepository<City, Long> {
}
