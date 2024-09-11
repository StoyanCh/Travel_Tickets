package com.springcourse.springboot.demo.ticket_sale.response;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class UserDataResponse {
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private String phoneNumber;
}
