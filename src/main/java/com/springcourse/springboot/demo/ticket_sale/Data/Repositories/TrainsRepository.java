package com.springcourse.springboot.demo.ticket_sale.Data.Repositories;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Trains.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainsRepository extends JpaRepository<Train, Long> {

    @Query(value = "CALL add_train(:vehicle_num, :agency_id, :train_reg_num, :train_type, :train_average_speed, :train_driver_id)", nativeQuery = true)
    void addTrain(@Param("vehicle_num") String vehicleNum,
                  @Param("agency_id") Long agencyId,
                  @Param("train_reg_num") String trainRegNum,
                  @Param("train_type") Long trainType,
                  @Param("train_average_speed") Double trainAverageSpeed,
                  @Param("train_driver_id") Long trainDriverId);
}
