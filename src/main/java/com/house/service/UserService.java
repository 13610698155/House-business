package com.house.service;

import com.house.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    /**
     * 登陆
     */
    User login(@Param("name") String username, @Param("pwd") String password);
    /**
     * 注册
     */
    void register(User user);
}
