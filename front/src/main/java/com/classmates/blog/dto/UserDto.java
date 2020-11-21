package com.classmates.blog.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @auth yangzhiwei
 * @date 2020-11-15 16:18
 */
@Data
@ApiModel(value = "用户信息")
public class UserDto {

    @ApiModelProperty("用户名")
    private String userName;
    //JsonProperty.Access.WRITE_ONLY: Json处理框架只会对该对象启用set方法，不会启用 get方法
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY,value = "passwd")
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("昵称")
    private String nickName;
    @ApiModelProperty("头像地址")
    private String avatar;
    @ApiModelProperty("验证码")
    private String verifiedCode;
}
