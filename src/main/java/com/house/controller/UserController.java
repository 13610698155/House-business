package com.house.controller;

import com.house.entity.User;
import com.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登陆
     */
    @RequestMapping("/login")
    public Object login(String username,String password){
        User user = userService.login(username, password);
        if(user!=null){
            Map<String,Object> map=new HashMap<>();
            map.put("user_id",user.getId());
            map.put("true",true);
            return map;
        }else{
            return false;
        }
    }
    /**
     * 注册
     */
    @RequestMapping("register")
    public Object register(User user){
        System.out.println(user);
        userService.register(user);
        return true;
    }
}
