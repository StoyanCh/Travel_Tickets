package com.springcourse.springboot.demo.ticket_sale.data.repositories;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Other.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Country, Long> {
}
