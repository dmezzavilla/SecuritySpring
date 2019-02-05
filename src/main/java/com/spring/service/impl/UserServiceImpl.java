package com.spring.service.impl;

import com.spring.entity.User;
import com.spring.repository.UserRepository;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void mergeUltimoLogin(User user) {

    }

    @Override
    public Iterable<User> findAllByIsActiveIsTrue() {
        return userRepository.findAllByIsActiveIsTrue();
    }

    @Override
    public void save(User user) {
        String passwordHash = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(passwordHash);
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void merge(User user) {

    }
}
