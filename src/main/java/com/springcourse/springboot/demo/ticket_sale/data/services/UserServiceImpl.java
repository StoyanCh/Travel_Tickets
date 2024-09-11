package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.User;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.UserRepository;
import com.springcourse.springboot.demo.ticket_sale.response.UserDataResponse;
import com.springcourse.springboot.demo.ticket_sale.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UserServiceImpl extends UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public UserDataResponse getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));

        return new UserDataResponse(user.getFirstName(), user.getLastName(), user.getEmail(), user.getAge(), user.getPhoneNumber());
    }

    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(Long id, User user) {
        user.setUser_id(id);
        return userRepository.save(user);
    }

    @Override
    public UserResponse getUserbyemail(String email) {
        return userRepository.findByEmail(email)
                .map(user -> new UserResponse(user.getUser_id(), user.getFirstName(), user.getLastName(), user.getEmail())) // Assuming UserResponse has appropriate constructor
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + email));
    }
}
