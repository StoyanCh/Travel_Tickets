package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Trains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "train_types")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TrainTypes {
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
}