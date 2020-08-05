package com.team.student.service.impl;

import com.team.student.dao.StudentsMapper;
import com.team.student.entity.Students;
import com.team.student.entity.StudentsExample;
import com.team.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王建兵
 * @Classname StudentServiceImpl
 * @Description TODO
 * @Date 2019/10/8 11:40
 * @Created by Administrator
 */

@Service   //注解ioc实现
public class StudentServiceImpl implements StudentService {
    @Autowired   //自动注入
    private StudentsMapper studentsMapper;

    @Override
    public List<Students> getAllStudent() {
        //调业dao层组件
        StudentsExample studentsExample=new StudentsExample();   //添加查询条件
        return this.studentsMapper.selectByExample(studentsExample);
    }
}
