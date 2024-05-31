package com.example.myspringboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.myspringboot.entry.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper extends BaseMapper<User> {
}
