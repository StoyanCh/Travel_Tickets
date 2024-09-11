package com.springcourse.springboot.demo.ticket_sale.data.entities.Admins;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Set;

@Entity(name = "admins")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long admin_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String admin_f_name;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String admin_s_name;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String admin_l_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_position_id", referencedColumnName = "admin_position_id", nullable = false)
    private AdminPositions adminsPosition;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(20)")
    private String admin_username;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(20)")
    private String admin_password;

    private Date admin_last_log;


    @ManyToMany
    @JoinTable(
            name = "admin_cans_list",
            joinColumns = @JoinColumn(name = "admin_id"),
            inverseJoinColumns = @JoinColumn(name = "admin_can_id")
    )
    private Set<AdminCans> adminCans;
}
