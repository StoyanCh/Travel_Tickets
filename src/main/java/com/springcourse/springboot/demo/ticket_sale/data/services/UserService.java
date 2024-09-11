package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.entities.User;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.UserRepository;
import com.springcourse.springboot.demo.ticket_sale.response.UserDataResponse;
import com.springcourse.springboot.demo.ticket_sale.response.UserResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@Transactional
@RequiredArgsConstructor
@ReadingConverter
public class UserService {
    private final UserRepository userRepostory;
    public UserResponse getUserbyemail(final String email)
    {
        User user =  userRepostory.findByEmail(email).get();
        return new UserResponse(user.getUser_id(),user.getFirstName(),user.getLastName(),user.getEmail());
    }

    public UserDataResponse getUserData(Long id) {
        User user = userRepostory.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        return new UserDataResponse(
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getAge(),
                user.getPhoneNumber()
        );
    }



    public User createUser(User user) {
        return user;
    }

    public UserDataResponse getUserById(Long id) {
        User user = userRepostory.findById(id).get();
        return new UserDataResponse(user.getFirstName(), user.getLastName(), user.getEmail(),user.getAge(),user.getPhoneNumber().toString());
    }

    public Iterable<User> getAllUsers() {
        return null;
    }

    public void deleteUser(Long id) {

    }

    public User updateUser(Long id, User user) {
        return null;
    }

}
