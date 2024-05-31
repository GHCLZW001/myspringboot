package com.example.myspringboot.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.myspringboot.entry.User;
import com.example.myspringboot.mapper.userMapper;
import com.example.myspringboot.service.userService;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl extends ServiceImpl<userMapper, User> implements userService {
}
