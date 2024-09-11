package com.springcourse.springboot.demo.ticket_sale.data.repositories;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Buses.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BusesRepository extends JpaRepository<Bus, Long> {

    @Query(value = "SELECT add_bus(:vehicleNum, :agencyId, :busRegNum, :busTypeId, :busAverageSpeed, :busDriverId)", nativeQuery = true)
    void addBus(
            @Param("vehicleNum") String vehicleNum,
            @Param("agencyId") Integer agencyId,
            @Param("busRegNum") String busRegNum,
            @Param("busTypeId") Integer busTypeId,
            @Param("busAverageSpeed") Double busAverageSpeed,
            @Param("busDriverId") Integer busDriverId
    );
}
