package com.springboot.app.service.impl;

import com.springboot.app.model.User;
import com.springboot.app.repository.UserRepository;
import com.springboot.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    //private final UserRepository userRepository;

  /*  public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    } */

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
