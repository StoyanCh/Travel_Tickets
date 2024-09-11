package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.User;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService; // Import without alias
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService { // Rename class

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> userOptional = userRepository.findByEmail(email);
        User user = userOptional.orElseThrow(() -> new UsernameNotFoundException("User not found: " + email));
        return user; // Return the User, which is also a UserDetails
    }
}
