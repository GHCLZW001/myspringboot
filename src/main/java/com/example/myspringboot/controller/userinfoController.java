package com.example.myspringboot.controller;

import com.example.myspringboot.entry.User;
import com.example.myspringboot.service.userService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
@Slf4j
public class userinfoController {
    @Resource
    private userService userService;

    @ResponseBody
    @PostMapping("/insert")
    public void save(){
        String name = "梁志文";
        String sex = "男";
        User user1 = new User();
        user1.setName(name);
        user1.setAge(25);
        user1.setSex(sex);
        userService.save(user1);
    }

}
