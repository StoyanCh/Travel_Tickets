package com.springcourse.springboot.demo.ticket_sale.Data.Repositories;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Ships.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipsRepository extends JpaRepository<Ship, Long> {

    @Query(value = "CALL add_ships(:vehicle_num, :agency_id, :ship_gen_number, :ship_type_id, :ship_average_speed, :ship_driver_id)", nativeQuery = true)
    void addShip(@Param("vehicle_num") String vehicle_num,
                 @Param("agency_id") Integer agency_id,
                 @Param("ship_gen_number") String ship_gen_number,
                 @Param("ship_type_id") Integer ship_type_id,
                 @Param("ship_average_speed") Double ship_average_speed,
                 @Param("ship_driver_id") Integer ship_driver_id);
}
