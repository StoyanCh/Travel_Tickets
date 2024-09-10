package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Trains;

import jakarta.persistence.*;

@Entity(name = "train_types")
public class train_types {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long train_type_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String train_type;

    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer train_wagon_count;
    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer train_seat_count;

    public train_types() {
    }

    public train_types(String train_type, Integer train_wagon_count, Integer train_seat_count) {
        this.train_type = train_type;
        this.train_wagon_count = train_wagon_count;
        this.train_seat_count = train_seat_count;
    }

    public Long getTrain_type_id() {
        return train_type_id;
    }

    public void setTrain_type_id(Long train_type_id) {
        this.train_type_id = train_type_id;
    }

    public String getTrain_type() {
        return train_type;
    }

    public void setTrain_type(String train_type) {
        this.train_type = train_type;
    }

    public Integer getTrain_wagon_count() {
        return train_wagon_count;
    }

    public void setTrain_wagon_count(Integer train_wagon_count) {
        this.train_wagon_count = train_wagon_count;
    }

    public Integer getTrain_seat_count() {
        return train_seat_count;
    }

    public void setTrain_seat_count(Integer train_seat_count) {
        this.train_seat_count = train_seat_count;
    }
}
