package com.springcourse.springboot.demo.ticket_sale;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Admins.admin_cans;
import com.springcourse.springboot.demo.ticket_sale.Data.Repositories.Admin_Cans_Repository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TicketSaleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketSaleApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(Admin_Cans_Repository admin_cans_repository){
        return args -> {
            admin_cans adminCans = new admin_cans("Test can");
            admin_cans_repository.save(adminCans);
        };
    }
}
