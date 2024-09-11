package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Other;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "workplaces")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Workplace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long workplace_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String workplace_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workplace_city_id", referencedColumnName = "city_id", nullable = false)
    private City city;

    @Column(length = 100, updatable = false, nullable = false, columnDefinition = "varchar(100)")
    private String workplace_address;

    @Column(length = 10, updatable = false, nullable = false, columnDefinition = "varchar(10)")
    private String workplace_phone_number;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String workplace_email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workplace_owneragency_id", referencedColumnName = "agency_id", nullable = false)
    private Agency agency;

    @Column(length = 5, updatable = false, nullable = false, columnDefinition = "varchar(5) default '00:00'")
    private String schedule_mtof_from;
    @Column(length = 5, updatable = false, nullable = false, columnDefinition = "varchar(5) default '23:59'")
    private String schedule_mtof_to;
    @Column(length = 5, updatable = false, nullable = false, columnDefinition = "varchar(5) default '00:00'")
    private String schedule_sattosun_from;
    @Column(length = 5, updatable = false, nullable = false, columnDefinition = "varchar(5) default '23:59'")
    private String schedule_sattosun_to;
    @Column(length = 5, updatable = false, nullable = false, columnDefinition = "varchar(5) default '00:00'")
    private String schedule_holidays_from;
    @Column(length = 5, updatable = false, nullable = false, columnDefinition = "varchar(5) default '17:00'")
    private String schedule_holidays_to;
}
