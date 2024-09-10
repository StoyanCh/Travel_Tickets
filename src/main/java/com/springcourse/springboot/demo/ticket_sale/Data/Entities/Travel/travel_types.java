package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Travel;

import jakarta.persistence.*;

@Entity(name = "travel_types")
public class travel_types {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long transport_type_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String transport_type;

    public travel_types() {
    }

    public travel_types(String transport_type) {
        this.transport_type = transport_type;
    }

    public Long getTransport_type_id() {
        return transport_type_id;
    }

    public void setTransport_type_id(Long transport_type_id) {
        this.transport_type_id = transport_type_id;
    }

    public String getTransport_type() {
        return transport_type;
    }

    public void setTransport_type(String transport_type) {
        this.transport_type = transport_type;
    }
}
