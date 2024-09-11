package com.springcourse.springboot.demo.ticket_sale.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {
    private String email;
    private String username;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private String egn;
    private String photo;
    private String birthdate;
    private Integer age;
    private String phoneNumber;

}
