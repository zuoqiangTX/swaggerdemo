package com.example.swaggerdemo.controller;

import com.example.swaggerdemo.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * 用户服务controller类
 *
 * @author zuoqiang
 */
@RestController
@Api(tags = "用户服务", description = "提供用户相关的 Rest API")
@RequestMapping("/user")
public class UserController {

    @ApiOperation("新增接口")
    @PostMapping("/add")
    public boolean addUser(@RequestBody User user) {
        return false;
    }

    @ApiOperation("查找接口")
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id) {
        return new User();
    }

    @ApiOperation("更新接口")
    @PutMapping("/update")
    public boolean update(@RequestBody User user) {
        return true;
    }

    @ApiOperation("删除接口")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }
}
