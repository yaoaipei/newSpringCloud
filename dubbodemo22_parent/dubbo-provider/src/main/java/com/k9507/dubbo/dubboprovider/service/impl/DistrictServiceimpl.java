package com.k9507.dubbo.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.k9507.dubbo.dubboprovider.entity.District;
import com.k9507.dubbo.dubboprovider.entity.DistrictExample;
import com.k9507.dubbo.dubboprovider.mapper.DistrictMapper;
import com.k9507.dubbo.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


//暴露提供的接口服务
@Service(interfaceClass = DistrictService.class)
@Component
public class DistrictServiceimpl implements DistrictService {

    @Autowired
    private DistrictMapper districtMapper;



    @Override
    public List<District> getAllDistrict() {
        return districtMapper.selectByExample(new DistrictExample());
    }
}
