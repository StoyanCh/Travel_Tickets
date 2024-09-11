package com.springcourse.springboot.demo.ticket_sale.Data.Services;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Trains.TrainTypes;
import com.springcourse.springboot.demo.ticket_sale.Data.Repositories.TrainTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainTypesService {

    @Autowired
    private TrainTypesRepository trainTypesRepository;

    public List<TrainTypes> getAllTrainTypes() {
        return trainTypesRepository.findAll();
    }

    public TrainTypes getTrainTypeById(Long id) {
        return trainTypesRepository.findById(id).orElse(null);
    }

    public TrainTypes createTrainType(TrainTypes trainType) {
        return trainTypesRepository.save(trainType);
    }

    public TrainTypes updateTrainType(Long id, TrainTypes trainType) {
        if (trainTypesRepository.existsById(id)) {
            trainType.setTrain_type_id(id);
            return trainTypesRepository.save(trainType);
        }
        return null;
    }

    public void deleteTrainType(Long id) {
        trainTypesRepository.deleteById(id);
    }
}
