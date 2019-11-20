package com.example.swaggerdemo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户表
 *
 * @author zuoqiang
 */
@Data
@ApiModel("用户信息")
public class User {
    @ApiModelProperty(value = "用户id", required = true, example = "zuoqiang")
    private int id;
    @ApiModelProperty(value = "用户姓名")
    private String name;
    @ApiModelProperty(value = "用户地址")
    private String address;
}

