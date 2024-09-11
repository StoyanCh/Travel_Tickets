package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Trains.Train;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.TrainsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainsService {

    @Autowired
    private TrainsRepository trainsRepository;

    public List<Train> getAllTrains() {
        return trainsRepository.findAll();
    }

    public Train getTrainById(Long id) {
        return trainsRepository.findById(id).orElse(null);
    }

    public void createTrain(Train train) {
        trainsRepository.addTrain(train.getVehicle_num(),
                train.getAgency().getAgency_id(),
                train.getTrain_reg_num(),
                train.getTrainTypes().getTrain_type_id(),
                train.getTrain_average_speed(),
                train.getEmployee().getEmployee_id());
    }

    public Train updateTrain(Long id, Train train) {
        if (trainsRepository.existsById(id)) {
            train.setTrain_id(id);
            return trainsRepository.save(train);
        }
        return null;
    }

    public void deleteTrain(Long id) {
        trainsRepository.deleteById(id);
    }
}
