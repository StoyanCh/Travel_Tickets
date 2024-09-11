package com.springcourse.springboot.demo.ticket_sale.data.repositories;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Airplanes.AirplaneTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneTypeRepository extends JpaRepository<AirplaneTypes, Long> {
    // Можеш да добавиш специфични методи за търсене, ако е нужно
}
