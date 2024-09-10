package com.springcourse.springboot.demo.ticket_sale.Data.Entities;

import jakarta.persistence.*;

@Entity(name = "users")
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long user_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String user_fname;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String user_sname;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String user_lname;

    @Column(length = 10, updatable = false, nullable = false, columnDefinition = "varchar(10)")
    private String user_egn;

    @Column(length = 150, columnDefinition = "varchar(150)")
    private String user_photo;

    @Column(updatable = false, nullable = false, columnDefinition = "Date")
    private String user_birth_date;

    @Column(nullable = false, columnDefinition = "Integer")
    private Integer user_age;

    @Column(length = 15, nullable = false, columnDefinition = "varchar(15)")
    private String user_phone_number;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String user_email;

    @Column(length = 20, updatable = false, nullable = false, columnDefinition = "varchar(20)")
    private String user_username;

    @Column(length = 20, updatable = false, nullable = false, columnDefinition = "varchar(20)")
    private String user_password;

    public users() {
    }

    public users(String user_fname, String user_sname, String user_lname, String user_egn, String user_photo, String user_birth_date, Integer user_age, String user_phone_number, String user_email, String user_username, String user_password) {
        this.user_fname = user_fname;
        this.user_sname = user_sname;
        this.user_lname = user_lname;
        this.user_egn = user_egn;
        this.user_photo = user_photo;
        this.user_birth_date = user_birth_date;
        this.user_age = user_age;
        this.user_phone_number = user_phone_number;
        this.user_email = user_email;
        this.user_username = user_username;
        this.user_password = user_password;
    }

    public String getUser_fname() {
        return user_fname;
    }

    public void setUser_fname(String user_fname) {
        this.user_fname = user_fname;
    }

    public String getUser_sname() {
        return user_sname;
    }

    public void setUser_sname(String user_sname) {
        this.user_sname = user_sname;
    }

    public String getUser_lname() {
        return user_lname;
    }

    public void setUser_lname(String user_lname) {
        this.user_lname = user_lname;
    }

    public String getUser_egn() {
        return user_egn;
    }

    public void setUser_egn(String user_egn) {
        this.user_egn = user_egn;
    }

    public String getUser_photo() {
        return user_photo;
    }

    public void setUser_photo(String user_photo) {
        this.user_photo = user_photo;
    }

    public String getUser_birth_date() {
        return user_birth_date;
    }

    public void setUser_birth_date(String user_birth_date) {
        this.user_birth_date = user_birth_date;
    }

    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }

    public String getUser_phone_number() {
        return user_phone_number;
    }

    public void setUser_phone_number(String user_phone_number) {
        this.user_phone_number = user_phone_number;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
