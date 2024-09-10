package com.springcourse.springboot.demo.ticket_sale.Data.Contrlollers;


import com.springcourse.springboot.demo.ticket_sale.Data.Services.AgenciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/agencies")
public class AgenciesController {

    @Autowired
    private AgenciesService agenciesService;

    @PostMapping("/add")
    public String addAgency(@RequestParam String name, @RequestParam String owner) {
        agenciesService.addNewAgency(name, owner);
        return "Agency added successfully!";
    }
}
