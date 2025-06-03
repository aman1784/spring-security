package com.example.securitydemo.repository;

import com.example.securitydemo.entity.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {

    // Find all roles assigned to a specific user by userId
    List<AppRole> findByUserId(Long userId);

    // Find all roles by role name
    List<AppRole> findByRoleName(String roleName);
}
