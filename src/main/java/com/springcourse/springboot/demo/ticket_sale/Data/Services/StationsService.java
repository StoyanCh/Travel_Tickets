package com.springcourse.springboot.demo.ticket_sale.Data.Services;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Travel.Station;
import com.springcourse.springboot.demo.ticket_sale.Data.Repositories.StationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationsService {

    @Autowired
    private StationsRepository stationsRepository;

    public List<Station> getAllStations() {
        return stationsRepository.findAll();
    }

    public Station getStationById(Long id) {
        return stationsRepository.findById(id).orElse(null);
    }

    public Station createStation(Station station) {
        return stationsRepository.save(station);
    }

    public Station updateStation(Long id, Station station) {
        if (stationsRepository.existsById(id)) {
            station.setStation_id(id);
            return stationsRepository.save(station);
        }
        return null;
    }

    public void deleteStation(Long id) {
        stationsRepository.deleteById(id);
    }
}
