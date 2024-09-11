package com.springcourse.springboot.demo.ticket_sale.data.repositories;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Travel.Travel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

@Repository
public interface TravelRepository extends CrudRepository<Travel, Long> {

    @Transactional
    @Modifying
    @Query(value = "SELECT add_travel(:p_travel_agency_id, :p_travel_agent_organizer_id, :p_vehicle_num, " +
            ":p_departure_station_id, :p_departure_date_time, :p_arrival_station_id, " +
            ":p_arrival_date_time, :p_transport_type_id)", nativeQuery = true)
    void addTravel(Integer p_travel_agency_id, Integer p_travel_agent_organizer_id, String p_vehicle_num,
                   Integer p_departure_station_id, Date p_departure_date_time, Integer p_arrival_station_id,
                   Date p_arrival_date_time, Integer p_transport_type_id);
}
