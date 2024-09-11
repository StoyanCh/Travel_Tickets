package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Ships;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.Employee;
import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.Agency;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "ships")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Ship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long ship_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String vehicle_num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agency_id", referencedColumnName = "agency_id", nullable = false)
    private Agency agency;

    @Column(length = 8, updatable = false, nullable = false, columnDefinition = "varchar(8)")
    private String ship_gen_number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ship_type_id", referencedColumnName = "ship_type_id")
    private ShipTypes shipTypes;

    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer ship_max_seats;

    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer ship_available_seats;
    @Column(updatable = false, nullable = false, columnDefinition = "Numeric")
    private Double ship_average_speed;

    @Column(length = 5, updatable = false, nullable = false, columnDefinition = "varchar(5)")
    private String speed_metrics;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ship_driver_id", referencedColumnName = "employee_id", nullable = false)
    private Employee employee;
}