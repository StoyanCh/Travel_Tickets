package com.springcourse.springboot.demo.ticket_sale;

import com.springcourse.springboot.demo.ticket_sale.data.entities.User;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.UserRepository;
import com.springcourse.springboot.demo.ticket_sale.data.services.UserService;
import com.springcourse.springboot.demo.ticket_sale.response.UserDataResponse;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUserById() {

        Long userId = 1L;
        User user = new User();
        user.setUser_id(userId);
        user.setFirstName("John");
        user.setMiddleName("John");
        user.setLastName("Doe");
        user.setEgn("0047859875");
        user.setBirthDate(LocalDate.of(2000, 07, 28));
        user.setAge(13);
        user.setPhoneNumber("0894645858");
        user.setEmail("john.doe@example.com");
        user.setUsername("username11");
        user.setPassword("password11");

        when(userRepository.findById(userId)).thenReturn(Optional.of(user));

        UserDataResponse userDataResponse = userService.getUserData(userId);

        assertNotNull(userDataResponse);
        assertEquals("John", userDataResponse.getFirstName());
        assertEquals("Doe", userDataResponse.getLastName());
        assertEquals("john.doe@example.com", userDataResponse.getEmail());
    }
}
