package com.springcourse.springboot.demo.ticket_sale.data.entities.Travel;

import com.springcourse.springboot.demo.ticket_sale.data.entities.Employees.Employee;
import com.springcourse.springboot.demo.ticket_sale.data.entities.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity(name = "tickets")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long ticket_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client", referencedColumnName = "user_id", updatable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "travel", referencedColumnName = "travel_id", nullable = false)
    private Travel travel;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String departure_station;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String arrival_station;

    @Column(nullable = false, columnDefinition = "Numeric")
    private String ticket_price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cashier", referencedColumnName = "employee_id", nullable = false)
    private Employee cashier;

    @Column(nullable = false, columnDefinition = "Date")
    private Date ticket_purchase_date;
}