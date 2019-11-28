package com.house.mapper;

import com.house.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {
    /**
     * 登陆
     */
    User login(@Param("name") String username, @Param("pwd") String password);
    /**
     * 注册
     */
    void register(User user);
}
