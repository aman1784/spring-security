package com.example.securitydemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "app_roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Role name example: ROLE_USER, ROLE_ADMIN
    @Column(nullable = false, unique = true)
    private String roleName;

    // Manually store the userId to assign this role to a user (no foreign key constraint)
    @Column(name = "user_id", nullable = false)
    private Long userId;

}
