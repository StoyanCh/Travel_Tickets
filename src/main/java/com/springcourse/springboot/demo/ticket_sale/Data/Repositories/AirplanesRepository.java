package com.springcourse.springboot.demo.ticket_sale.Data.Repositories;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Airplanes.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AirplanesRepository extends JpaRepository<Airplane, Long> {

    @Query(value = "SELECT add_airplane(:vehicleNum, :agencyId, :airplaneRegNum, :airplaneTypeId, :airplaneAverageSpeed, :airplanesDriver)", nativeQuery = true)
    void addAirplane(
            @Param("vehicleNum") String vehicleNum,
            @Param("agencyId") Integer agencyId,
            @Param("airplaneRegNum") String airplaneRegNum,
            @Param("airplaneTypeId") Integer airplaneTypeId,
            @Param("airplaneAverageSpeed") Double airplaneAverageSpeed,
            @Param("airplanesDriver") Integer airplanesDriver
    );
}
