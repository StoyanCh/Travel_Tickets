package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.config.SecurityConfig;
import com.springcourse.springboot.demo.ticket_sale.data.entities.User;
import com.springcourse.springboot.demo.ticket_sale.request.AuthenticationRequest;
import com.springcourse.springboot.demo.ticket_sale.request.RegistrationRequest;
import com.springcourse.springboot.demo.ticket_sale.response.AuthenticationResponse;
import com.springcourse.springboot.demo.ticket_sale.data.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@ReadingConverter
@RequiredArgsConstructor
public class RegisterService {

    private final UserRepository userRepository;
    private final AuthenticationService authenticationService;
    private final SecurityConfig securityConfig;
    public AuthenticationResponse registerUser(RegistrationRequest request) throws Throwable {

        var user = userRepository.findByEmail(request.getEmail());
        if(user.isPresent()){
            //email already taken
            return null;
        }

        User toRegister = new User();
        toRegister.setEmail(request.getEmail());
        toRegister.setUsername(request.getUsername());
        toRegister.setPassword(securityConfig.passwordEncoder().encode(request.getPassword()));
        toRegister.setFirstName(request.getFirstName());
        toRegister.setMiddleName(request.getMiddleName());
        toRegister.setLastName(request.getLastName());
        toRegister.setEgn(request.getEgn());
        toRegister.setAge(request.getAge());
        toRegister.setPhoneNumber(request.getPhoneNumber());
        userRepository.save(toRegister);

        return authenticationService.authenticate(
                new AuthenticationRequest(request.getEmail(),request.getPassword()));
    }
}
