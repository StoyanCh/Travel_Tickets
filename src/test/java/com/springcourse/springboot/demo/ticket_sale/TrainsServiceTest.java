package com.springcourse.springboot.demo.ticket_sale;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Trains.Train;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.TrainsRepository;
import com.springcourse.springboot.demo.ticket_sale.data.services.TrainsService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TrainsServiceTest {

    @InjectMocks
    private TrainsService trainsService;
    @Mock
    private TrainsRepository trainsRepository;
    public TrainsServiceTest() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void testGetTrainById_ExistingTrain() {
        Long trainId = 1L;
        Train train = new Train();
        train.setTrain_id(trainId);
        train.setVehicle_num("Train123");

        when(trainsRepository.findById(trainId)).thenReturn(Optional.of(train));

        Train foundTrain = trainsService.getTrainById(trainId);

        assertNotNull(foundTrain);
        assertEquals(trainId, foundTrain.getTrain_id());
        assertEquals("Train123", foundTrain.getVehicle_num());
    }
    @Test
    public void testGetTrainById_NonExistingTrain() {
        Long trainId = 1L;

        when(trainsRepository.findById(trainId)).thenReturn(Optional.empty());

        Train foundTrain = trainsService.getTrainById(trainId);

        assertNull(foundTrain);
    }
}
