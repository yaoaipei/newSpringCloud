package com.team.student.controller;

import com.team.student.entity.Students;
import com.team.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.util.List;

/**
 * @author 王建兵
 * @Classname StudentController
 * @Description TODO
 * @Date 2019/10/8 11:46
 * @Created by Administrator
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    //一个请求一个方法    传统方法:返回视图页面
    @RequestMapping("/showStudent")
    public String showStudent(Model model){
        //调用业务
        List<Students> list=this.studentService.getAllStudent();
        //将数据填充到作用域
        model.addAttribute("list",list);
        //返回视图
        return "index";
    }

    //返回异步数据
    @RequestMapping("getStudentData")
    @ResponseBody
    public List<Students> getStudentData(){
       //调用业务
     List<Students> list=this.studentService.getAllStudent();

       //?将数据返回，数据格式为:json
        return list;
    }

    //springmvc如何返回异步数据
    //@RequestMapping("/index")
    //@ResponseBody
    //public String goIndex(){
    //    return "{\"name\":\"张三\"}";
    //}
    //控制器输出的内容就是返回给客户端的数据
    //注意: @ResponseBody作用就是将方法的返回值输出到网页中
    //支持将java对象自动转化为json对象,注意:底层需要jackson工具包支持
}
