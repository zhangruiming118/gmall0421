package com.atguigu.gmall0421.user.controller;

import com.atguigu.gmall0421.bean.UserInfo;
import com.atguigu.gmall0421.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping
    public List<UserInfo> findAll(){
        return userService.findAll();
    }

}
