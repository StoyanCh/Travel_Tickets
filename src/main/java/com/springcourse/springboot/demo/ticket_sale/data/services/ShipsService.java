package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Ships.Ship;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.ShipsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipsService {

    @Autowired
    private ShipsRepository shipsRepository;

    public void createShip(Ship ship) {
        shipsRepository.addShip(
                ship.getVehicle_num(),
                Math.toIntExact(ship.getAgency().getAgency_id()), // Предполага се, че имате метод за получаване на agency_id
                ship.getShip_gen_number(),
                Math.toIntExact(ship.getShipTypes().getShip_type_id()), // Предполага се, че имате метод за получаване на ship_type_id
                ship.getShip_average_speed(),
                Math.toIntExact(ship.getEmployee().getEmployee_id()) // Предполага се, че имате метод за получаване на employee_id
        );
    }

    public List<Ship> getAllShips() {
        return shipsRepository.findAll();
    }

    public Ship getShipById(Long id) {
        return shipsRepository.findById(id).orElse(null);
    }

    public Ship updateShip(Long id, Ship ship) {
        if (shipsRepository.existsById(id)) {
            ship.setShip_id(id);
            return shipsRepository.save(ship);
        }
        return null;
    }

    public void deleteShip(Long id) {
        shipsRepository.deleteById(id);
    }
}
