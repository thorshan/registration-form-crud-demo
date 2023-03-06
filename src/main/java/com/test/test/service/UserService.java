package com.test.test.service;

import java.util.List;

import com.test.test.entity.Users;

public interface UserService{
    List<Users> getAllUser();

    Users saveUser(Users users);
}
