package com.classmates.blog.mapper;

import com.classmates.blog.dto.UserDto;
import com.classmates.blog.po.UserPo;

public interface UserMapper {
    UserPo login(UserDto user);
    int  register(UserPo user);
}
