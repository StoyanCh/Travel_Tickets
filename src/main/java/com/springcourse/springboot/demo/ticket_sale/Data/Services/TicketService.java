package com.springcourse.springboot.demo.ticket_sale.Data.Services;

import com.springcourse.springboot.demo.ticket_sale.Data.Repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public void buyTicket(Integer clientId, Integer travelId, String ticketPrice, Integer cashierId) {
        ticketRepository.buyTicket(clientId, travelId, ticketPrice, cashierId);
    }
}
