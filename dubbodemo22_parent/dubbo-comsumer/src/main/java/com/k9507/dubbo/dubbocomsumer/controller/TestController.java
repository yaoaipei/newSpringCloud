package com.k9507.dubbo.dubbocomsumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.k9507.dubbo.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

  //注入接口  调用服务的 到注册中心匹配
    @Reference(interfaceClass = TestService.class,version = "1.0",check = false)
    private TestService testService;

    @RequestMapping("/getData")
    @ResponseBody
    public String getData(){

        return this.testService.getHw();
    }
}
