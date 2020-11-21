package com.classmates.blog.service.impl;

import com.classmates.blog.dto.UserDto;
import com.classmates.blog.mapper.UserMapper;
import com.classmates.blog.po.UserPo;
import com.classmates.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDto login(UserDto user) {
        UserDto verfiedUser = new UserDto();

        String reqPassword = user.getPassword();
        UserPo userInfo = userMapper.login(user);
        return null;
    }

    public UserDto register(UserDto user) {
        UserDto verfiedUser = new UserDto();
        UserPo userInfo = userMapper.login(user);
        return null;
    }
}
