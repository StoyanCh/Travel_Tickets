package com.springcourse.springboot.demo.ticket_sale.Data.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long user_id;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String firstName;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String middleName;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String lastName;

    @Column(length = 10, updatable = false, nullable = false, columnDefinition = "varchar(10)")
    private String egn;

    @Column(length = 150, columnDefinition = "varchar(150)")
    private String photo;

    @Column(updatable = false, nullable = false, columnDefinition = "Date")
    private String birthDate;

    @Column(nullable = false, columnDefinition = "Integer")
    private Integer age;

    @Column(length = 15, nullable = false, columnDefinition = "varchar(15)")
    private String phoneNumber;

    @Column(length = 50, updatable = false, nullable = false, columnDefinition = "varchar(50)")
    private String email;

    @Column(length = 20, updatable = false, nullable = false, columnDefinition = "varchar(20)")
    private String username;

    @Column(length = 20, nullable = false, columnDefinition = "varchar(20)")
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Implement authorities or roles here
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        // Customize this logic based on your needs
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // Customize this logic based on your needs
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // Customize this logic based on your needs
        return true;
    }

    @Override
    public boolean isEnabled() {
        // Customize this logic based on your needs
        return true;
    }
}
