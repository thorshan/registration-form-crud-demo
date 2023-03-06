package com.test.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
    
}