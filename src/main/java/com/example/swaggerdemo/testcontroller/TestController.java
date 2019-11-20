package com.example.swaggerdemo.testcontroller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zuoqiang
 */
@RestController
@RequestMapping("/test")
@Api(tags = "测试相关接口", description = "提供测试相关的Rest API")
public class TestController {

    @ApiOperation("测试接口")
    @GetMapping("/test")
    public void test() {
        System.out.println("test");
    }

}