package com.k9507.dubbo.dubbocomsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.k9507.dubbo.dubboprovider.entity.District;
import com.k9507.dubbo.service.DistrictService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.Null;
import java.util.List;

/**
 * @author 王建兵
 * @Classname DistrictController
 * @Description TODO
 * @Date 2019/11/4 10:59
 * @Created by Administrator
 */
@Controller
public class DistrictController {

    //调用接口服务
    @Reference(interfaceClass = DistrictService.class,check = false)
    private DistrictService districtService;

    @RequestMapping("/showDistrict")
    public String showDistrict(Model model){
       List<District> list=districtService.getAllDistrict();
       model.addAttribute("list",list);
       return "index";
    }


}
