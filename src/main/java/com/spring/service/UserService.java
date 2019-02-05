package com.spring.service;

import com.spring.entity.User;

public interface UserService {

    User findUserByEmail(String email);

    void save(User user);

    void saveLastLogin(User user);
}
