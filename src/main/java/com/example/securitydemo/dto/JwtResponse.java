package com.example.securitydemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class JwtResponse {

    private String token;
    private String tokenType = "Bearer";
    private Long userId;
    private String username;
    private Set<String> roles;
}
