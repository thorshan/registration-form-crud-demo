package com.test.test.service.impl;

import java.util.List;

import com.test.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.test.entity.Users;
import com.test.test.service.UserService;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Users> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Users saveUser(Users users) {
        return userRepository.save(users);
    }
}
