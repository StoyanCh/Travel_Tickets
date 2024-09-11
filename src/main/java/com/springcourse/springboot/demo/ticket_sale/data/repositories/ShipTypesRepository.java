package com.springcourse.springboot.demo.ticket_sale.data.repositories;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Ships.ShipTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipTypesRepository extends JpaRepository<ShipTypes, Long> {
    // Можете да добавите нужни методи за специфични заявки тук
}
