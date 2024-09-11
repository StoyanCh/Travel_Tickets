package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Airplanes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "airplane_types")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AirplaneTypes {
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
}
