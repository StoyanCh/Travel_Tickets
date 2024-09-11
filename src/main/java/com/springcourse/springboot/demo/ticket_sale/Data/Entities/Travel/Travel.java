package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Travel;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.Employee;
import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other.Agency;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "travels")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long travel_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "travel_agency_id", referencedColumnName = "agency_id")
    private Agency agency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "travel_agent_organizer_id", referencedColumnName = "employee_id", nullable = false)
    private Employee employee;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String vehicle_num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departure_station_id", referencedColumnName = "station_id", nullable = false)
    private Station departure_station;

    @Column(updatable = false, nullable = false, columnDefinition = "date")
    private LocalDateTime departure_date_time;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "arrival_station_id", referencedColumnName = "station_id", nullable = false)
    private Station arrival_station;

    @Column(updatable = false, nullable = false, columnDefinition = "date")
    private LocalDateTime arrival_date_time;

    @Column(nullable = false, columnDefinition = "boolean")
    private Boolean available;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transport_type_id", referencedColumnName = "transport_type_id", nullable = false)
    private TransportType travelTypes;

}