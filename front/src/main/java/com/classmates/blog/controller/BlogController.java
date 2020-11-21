package com.classmates.blog.controller;

import com.classmates.blog.common.ResultResponse;
import com.classmates.blog.dto.UserDto;
import com.classmates.blog.service.IBlogService;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    IBlogService iBlogService;
    // todo
    // 1.登录 2.注册功能  17:30
    @RequestMapping("/login")
    @ApiResponse(code = 200,message = "登录接口",response = UserDto.class)
    public ResultResponse<UserDto> login(
            @ApiParam(value = "必须有用户名和密码") @RequestBody UserDto userInfo) {

        UserDto verfiedUser =  iBlogService.login(userInfo);
        return ResultResponse.SUCCESS;
    }

    @ApiResponse(code = 200,message = "注册接口",response = UserDto.class)
    public ResultResponse<UserDto> register(
            @ApiParam(value = "用户名 密码 验证码是必须的")@RequestBody UserDto userInfo) {

        return ResultResponse.SUCCESS;
    }


}
