package com.springcourse.springboot.demo.ticket_sale.Data.Repositories;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Ships.ShipTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipTypesRepository extends JpaRepository<ShipTypes, Long> {
    // Можете да добавите нужни методи за специфични заявки тук
}
