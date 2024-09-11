package com.springcourse.springboot.demo.ticket_sale.data.controllers;
import com.springcourse.springboot.demo.ticket_sale.data.services.AuthenticationService;
import com.springcourse.springboot.demo.ticket_sale.data.services.RegisterService;
import com.springcourse.springboot.demo.ticket_sale.request.AuthenticationRequest;
import com.springcourse.springboot.demo.ticket_sale.request.RegistrationRequest;
import com.springcourse.springboot.demo.ticket_sale.response.AuthenticationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;
    private final RegisterService registerService;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) throws Throwable {
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> registerUser(
            @RequestBody RegistrationRequest request
    ) throws Throwable {
        AuthenticationResponse response = registerService.registerUser(request);
        if(response == null){
            return ResponseEntity.status(HttpStatus.SEE_OTHER).body(null);
        }
        return ResponseEntity.ok(response);
    }
}