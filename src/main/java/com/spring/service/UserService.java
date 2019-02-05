package com.spring.service;

import com.spring.entity.User;

import java.util.List;

public interface UserService {
    User findUserByEmail(String email);

    void mergeUltimoLogin(User user);

    Iterable<User> findAllByIsActiveIsTrue();

    void save(User user);

    List<User> findAll();

    User findById(Long id);

    void merge(User user);
}
