package com.team.student.service;

import com.team.student.entity.Students;

import java.util.List;

/**
 * @author 王建兵
 * @Classname StudentService
 * @Description TODO
 * @Date 2019/10/8 11:37
 * @Created by Administrator
 */
public interface StudentService {
    //一功能一业务一方法
    List<Students> getAllStudent();

}
