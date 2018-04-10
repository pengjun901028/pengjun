package com.mser.controller;

import com.mser.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Api(tags = "用户功能", description = "用户相关操作，比如登录，登出,冻结等获取基本信息")
@Slf4j
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @Value("${email.username}")
    String hikariUser;

    @GetMapping("/service")
    public String service() {
        return "service:" + hikariUser;
    }

    @ApiOperation(notes = "注册", value = "注册")
    @PostMapping("/test")
    public String register(
            @ApiParam(value = "验证码", required = true) @RequestParam String code,
            @ApiParam(value = "邮箱", required = true) @RequestParam String email,
            @ApiParam(value = "密码", required = true) @RequestParam String password,
            @ApiParam(value = "IP地址", required = true) @RequestParam String ip,
            @ApiParam(value = "推荐人ID") @RequestParam() Long referenceId

    ) {
        testService.redis();
        return "service:" + hikariUser;
    }
}
