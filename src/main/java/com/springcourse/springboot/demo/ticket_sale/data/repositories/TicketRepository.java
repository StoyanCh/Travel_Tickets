package com.springcourse.springboot.demo.ticket_sale.data.repositories;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Travel.Ticket;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {

    @Transactional
    @Modifying
    @Query(value = "SELECT buy_a_ticket(:p_client, :p_travel, :p_ticket_price, :p_cashier)", nativeQuery = true)
    void buyTicket(Integer p_client, Integer p_travel, String p_ticket_price, Integer p_cashier);
}
