package com.house.service;

import com.house.entity.User;
import com.house.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpI implements UserService {

    @Autowired
    private UserMapper userDao;

    @Override
    public User login(String username, String password) {
        return userDao.login(username,password);
    }

    @Override
    public void register(User user) {
        userDao.register(user);
    }
}
