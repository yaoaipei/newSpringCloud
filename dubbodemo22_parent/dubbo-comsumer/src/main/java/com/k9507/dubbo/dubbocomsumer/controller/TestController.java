package com.k9507.dubbo.dubbocomsumer.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {



    @RequestMapping("/getData")
    @ResponseBody
    public String getData(){

        return "";
    }
}
