package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Airplanes;

import jakarta.persistence.*;

@Entity(name = "airplane_types")
public class airplane_types {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long airplane_type_id;
    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String airplane_type;

    @Column(updatable = false ,columnDefinition = "Integer")
    private Integer airplane_first_class_seats;
    @Column(updatable = false ,columnDefinition = "Integer")
    private Integer airplane_second_class_seats;
    @Column(updatable = false ,columnDefinition = "Integer")
    private Integer airplane_normal_class_seats;

    public airplane_types() {
    }

    public airplane_types(String airplane_type, Integer airplane_first_class_seats, Integer airplane_second_class_seats, Integer airplane_normal_class_seats) {
        this.airplane_type = airplane_type;
        this.airplane_first_class_seats = airplane_first_class_seats;
        this.airplane_second_class_seats = airplane_second_class_seats;
        this.airplane_normal_class_seats = airplane_normal_class_seats;
    }

    public Long getAirplane_type_id() {
        return airplane_type_id;
    }

    public void setAirplane_type_id(Long airplane_type_id) {
        this.airplane_type_id = airplane_type_id;
    }

    public String getAirplane_type() {
        return airplane_type;
    }

    public void setAirplane_type(String airplane_type) {
        this.airplane_type = airplane_type;
    }

    public Integer getAirplane_first_class_seats() {
        return airplane_first_class_seats;
    }

    public void setAirplane_first_class_seats(Integer airplane_first_class_seats) {
        this.airplane_first_class_seats = airplane_first_class_seats;
    }

    public Integer getAirplane_second_class_seats() {
        return airplane_second_class_seats;
    }

    public void setAirplane_second_class_seats(Integer airplane_second_class_seats) {
        this.airplane_second_class_seats = airplane_second_class_seats;
    }

    public Integer getAirplane_normal_class_seats() {
        return airplane_normal_class_seats;
    }

    public void setAirplane_normal_class_seats(Integer airplane_normal_class_seats) {
        this.airplane_normal_class_seats = airplane_normal_class_seats;
    }
}
