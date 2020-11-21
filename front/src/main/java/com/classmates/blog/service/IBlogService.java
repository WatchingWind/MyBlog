package com.classmates.blog.service;

import com.classmates.blog.dto.UserDto;

/**
 * @auth yangzhiwei
 * @date 2020-11-15 16:03
 */

public interface IBlogService {
    UserDto login(UserDto userInfo);
}
