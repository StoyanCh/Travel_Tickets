package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Travel;

import com.springcourse.springboot.demo.ticket_sale.Data.Entities.Employees.employees;
import com.springcourse.springboot.demo.ticket_sale.Data.Entities.users;
import jakarta.persistence.*;

import java.sql.Date;

@Entity(name = "tickets")
public class tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long ticket_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client", referencedColumnName = "user_id", updatable = false)
    private users user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "travel", referencedColumnName = "travel_id", nullable = false)
    private travels travel;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String departure_station;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String arrival_station;

    @Column(nullable = false, columnDefinition = "Numeric")
    private String ticket_price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cashier", referencedColumnName = "employee_id", nullable = false)
    private employees cashier;

    @Column(nullable = false, columnDefinition = "Date")
    private Date ticket_purchase_date;

}
