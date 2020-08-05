package com.springcloud2.eureka_consumer_web.controller;


import com.springcloud2.eureka_consumer_web.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    //注入RestTemplate对象创建对象
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/showStudent")
    public Student showStudent(){
    //显示学生,调用服务获取学生进行展示

        //调用服务
        //1.使用RresTemplata调用对象调用服务
        //this.restTemplate.getForObject("提供服务的服务器的地址",数据类型类);
        //支持将json转化为java对象
        //Student stu = this.restTemplate.getForObject("http://localhost:9002/getStudent", Student.class);
        //this.restTemplate.getForObject("http://服务名称/请求",类型);
        Student stu = this.restTemplate.getForObject("http://EUREKA-PROVIDER/getStudent", Student.class);
        return stu;
    }

}
