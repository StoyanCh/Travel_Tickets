package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Ships;

import jakarta.persistence.*;

@Entity(name = "ship_types")
public class ship_types {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long ship_type_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String ship_type;

    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer ship_first_clas_seats;
    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer ship_second_clas_seats;

    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer ship_normal_clas_seats;

    public ship_types() {
    }

    public ship_types(String ship_type, Integer ship_first_clas_seats, Integer ship_second_clas_seats, Integer ship_normal_clas_seats) {
        this.ship_type = ship_type;
        this.ship_first_clas_seats = ship_first_clas_seats;
        this.ship_second_clas_seats = ship_second_clas_seats;
        this.ship_normal_clas_seats = ship_normal_clas_seats;
    }

    public String getShip_type() {
        return ship_type;
    }

    public void setShip_type(String ship_type) {
        this.ship_type = ship_type;
    }

    public Integer getShip_first_clas_seats() {
        return ship_first_clas_seats;
    }

    public void setShip_first_clas_seats(Integer ship_first_clas_seats) {
        this.ship_first_clas_seats = ship_first_clas_seats;
    }

    public Integer getShip_second_clas_seats() {
        return ship_second_clas_seats;
    }

    public void setShip_second_clas_seats(Integer ship_second_clas_seats) {
        this.ship_second_clas_seats = ship_second_clas_seats;
    }

    public Integer getShip_normal_clas_seats() {
        return ship_normal_clas_seats;
    }

    public void setShip_normal_clas_seats(Integer ship_normal_clas_seats) {
        this.ship_normal_clas_seats = ship_normal_clas_seats;
    }
}
