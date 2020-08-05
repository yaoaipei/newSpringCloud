package com.springcloud2.eureka_provider.controller;


import com.springcloud2.eureka_provider.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//微服务不用跳页面 直接返回异步数据
@RestController
public class TestController {





    //实体不需要序列化,因为返回的是json
    @RequestMapping("/getStudent")
    public Student getStudent(){
        //c创建学生对象====>操作数据库获取学生信息
        Student student = new Student(101,"张三","男",23);

        return student;
    }



}
