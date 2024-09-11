package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Airplanes;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.Employee;
import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.Agency;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "airplanes")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long airplane_id;
    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String vehicle_num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agency_id", referencedColumnName = "agency_id")
    private Agency agency;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String airplane_reh_num;
    @ManyToOne
    @JoinColumn(name = "airplane_type_id", referencedColumnName = "airplane_type_id")
    private AirplaneTypes airplaneTypes;
    @Column(updatable = false, nullable = false, columnDefinition = "Integer")
    private Integer airplane_available_seats;

    @Column(updatable = false, nullable = false, columnDefinition = "Numeric")
    private Double airplane_average_speed;
    @Column(length = 5, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String speed_metrics;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airplanes_driver", referencedColumnName = "employee_id")
    private Employee airplanes_driver;
}
