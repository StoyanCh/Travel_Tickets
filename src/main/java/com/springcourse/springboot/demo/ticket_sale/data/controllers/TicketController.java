package com.springcourse.springboot.demo.ticket_sale.data.controllers;

import com.springcourse.springboot.demo.ticket_sale.data.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/buy")
    public void buyTicket(@RequestParam Integer clientId,
                          @RequestParam Integer travelId,
                          @RequestParam String ticketPrice,
                          @RequestParam Integer cashierId) {
        ticketService.buyTicket(clientId, travelId, ticketPrice, cashierId);
    }
}
