package com.springcourse.springboot.demo.ticket_sale.data.controllers;

import com.springcourse.springboot.demo.ticket_sale.data.entities.User;
import com.springcourse.springboot.demo.ticket_sale.data.services.UserService;
import com.springcourse.springboot.demo.ticket_sale.response.UserDataResponse;
import com.springcourse.springboot.demo.ticket_sale.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public UserDataResponse getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/all_users") // Добавен метод за извличане на всички потребители
    public Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        return userService.updateUser(id, userDetails);
    }

    @GetMapping("/{mail}")
    public UserResponse getUserByEmail(@RequestParam String email) {
        return userService.getUserbyemail(email);
    }

    // Нов метод за извличане на UserDataResponse по ID
    @GetMapping("/data/{id}")
    public UserDataResponse getUserData(@PathVariable Long id) {
        return userService.getUserData(id);
    }

}