package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Admins;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "admins_positions")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AdminPositions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long admin_position_id;

    @Column(length = 50, updatable = false, nullable = false,
            columnDefinition = "varchar(50)")
    private String admin_position;

    public AdminPositions(String admin_position) {
        this.admin_position = admin_position;
    }

    public Long getAdmin_position_id() {
        return admin_position_id;
    }

    public void setAdmin_position_id(Long admin_position_id) {
        this.admin_position_id = admin_position_id;
    }

    public String getAdmin_position() {
        return admin_position;
    }

    public void setAdmin_position(String admin_position) {
        this.admin_position = admin_position;
    }
}
