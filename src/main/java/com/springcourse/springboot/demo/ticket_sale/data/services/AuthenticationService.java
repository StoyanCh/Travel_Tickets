package com.springcourse.springboot.demo.ticket_sale.data.services;

import com.springcourse.springboot.demo.ticket_sale.data.repositories.UserRepository;
import com.springcourse.springboot.demo.ticket_sale.jwt.JwtUtil;
import com.springcourse.springboot.demo.ticket_sale.request.AuthenticationRequest;
import com.springcourse.springboot.demo.ticket_sale.response.AuthenticationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@Transactional
@ReadingConverter
@RequiredArgsConstructor
public class AuthenticationService {
    private final JwtUtil jwtUtil;
    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;


    public AuthenticationResponse authenticate(AuthenticationRequest request) throws Throwable {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );

        var user = userRepository.findByEmail(request.getEmail()).orElseThrow(
                () -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "user not found"
                )
        );

        var jwtToken = jwtUtil.generateToken((UserDetails) user);

        return AuthenticationResponse.builder()
                .accessToken(jwtToken)
                .build();
    }
}