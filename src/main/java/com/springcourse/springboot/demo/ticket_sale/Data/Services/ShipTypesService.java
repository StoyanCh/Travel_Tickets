package com.springcourse.springboot.demo.ticket_sale.Data.Services;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Ships.ShipTypes;
import com.springcourse.springboot.demo.ticket_sale.Data.Repositories.ShipTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipTypesService {

    @Autowired
    private ShipTypesRepository shipTypesRepository;

    public List<ShipTypes> getAllShipTypes() {
        return shipTypesRepository.findAll();
    }

    public ShipTypes getShipTypeById(Long id) {
        return shipTypesRepository.findById(id).orElse(null);
    }

    public ShipTypes createShipType(ShipTypes shipType) {
        return shipTypesRepository.save(shipType);
    }

    public ShipTypes updateShipType(Long id, ShipTypes shipType) {
        if (shipTypesRepository.existsById(id)) {
            shipType.setShip_type_id(id);
            return shipTypesRepository.save(shipType);
        }
        return null;
    }

    public void deleteShipType(Long id) {
        shipTypesRepository.deleteById(id);
    }
}
