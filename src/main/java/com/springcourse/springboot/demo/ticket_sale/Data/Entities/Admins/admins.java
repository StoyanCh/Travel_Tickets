package com.springcourse.springboot.demo.ticket_sale.Data.Entities.Admins;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity(name = "admins")
public class admins {

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
    private admins_positions adminsPosition;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(20)")
    private String admin_username;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(20)")
    private String admin_password;

    @Column(nullable = false)
    private Date admin_last_log;

    @ManyToMany
    @JoinTable(
            name = "admin_cans_list",
            joinColumns = @JoinColumn(name = "admin_id"),
            inverseJoinColumns = @JoinColumn(name = "admin_can_id")
    )
    private Set<admin_cans> adminCans;

    public admins() {
    }

    public admins(String admin_f_name, String admin_s_name, String admin_l_name, admins_positions adminsPosition, String admin_username, String admin_password, Date admin_last_log) {
        this.admin_f_name = admin_f_name;
        this.admin_s_name = admin_s_name;
        this.admin_l_name = admin_l_name;
        this.adminsPosition = adminsPosition;
        this.admin_username = admin_username;
        this.admin_password = admin_password;
        this.admin_last_log = admin_last_log;
    }

    public Long getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Long admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_f_name() {
        return admin_f_name;
    }

    public void setAdmin_f_name(String admin_f_name) {
        this.admin_f_name = admin_f_name;
    }

    public String getAdmin_s_name() {
        return admin_s_name;
    }

    public void setAdmin_s_name(String admin_s_name) {
        this.admin_s_name = admin_s_name;
    }

    public String getAdmin_l_name() {
        return admin_l_name;
    }

    public void setAdmin_l_name(String admin_l_name) {
        this.admin_l_name = admin_l_name;
    }

    public admins_positions getAdminsPosition() {
        return adminsPosition;
    }

    public void setAdminsPosition(admins_positions adminsPosition) {
        this.adminsPosition = adminsPosition;
    }

    public String getAdmin_username() {
        return admin_username;
    }

    public void setAdmin_username(String admin_username) {
        this.admin_username = admin_username;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public Date getAdmin_last_log() {
        return admin_last_log;
    }

    public void setAdmin_last_log(Date admin_last_log) {
        this.admin_last_log = admin_last_log;
    }

    public Set<admin_cans> getAdminCans() {
        return adminCans;
    }

    public void setAdminCans(Set<admin_cans> adminCans) {
        this.adminCans = adminCans;
    }
}
