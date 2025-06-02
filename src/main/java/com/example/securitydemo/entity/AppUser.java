package com.example.securitydemo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "app_users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    // NOTE: No foreign key or mapping annotations to roles here per requirement

    // To hold roles manually, this set is NOT persisted directly but helps in code (transient)
    @Transient
    private Set<AppRole> roles = new HashSet<>();

}
