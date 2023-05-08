package com.example.springbootregisterlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootregisterlogin.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
