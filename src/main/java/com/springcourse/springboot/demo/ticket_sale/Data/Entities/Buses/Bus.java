package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Buses;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.Employee;
import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.Agency;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "buses")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long bus_id;
    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String vehicle_num;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agency_id", referencedColumnName = "agency_id")
    private Agency agency;
    @Column(length = 8, updatable = false, nullable = false, columnDefinition = "varchar(8)")
    private String bus_reg_num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_type_id", referencedColumnName = "bus_type_id")
    private BusTypes busType;
    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer bus_max_seats;

    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer bus_available_seats;
    @Column(updatable = false, nullable = false, columnDefinition = "Numeric")
    private Double bus_average_speed;
    @Column(length = 4, updatable = false, nullable = false, columnDefinition = "varchar(4)")
    private String speed_metrics;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_driver_id", referencedColumnName = "employee_id")
    private Employee bus_driver;
}
