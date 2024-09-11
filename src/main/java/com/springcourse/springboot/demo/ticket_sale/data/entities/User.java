package com.springcourse.springboot.demo.ticket_sale.data.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Entity(name = "users")
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
    private LocalDate birthDate;

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


    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Return the authorities granted to the user (can be empty if not used)
        return List.of(); // Example, replace with your roles/authorities if needed
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Implement your logic
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Implement your logic
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Implement your logic
    }

    @Override
    public boolean isEnabled() {
        return true; // Implement your logic
    }
}