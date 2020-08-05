package com.k9507.dubbo.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.k9507.dubbo.service.TestService;
import org.springframework.stereotype.Component;


//dubboo的Service  服务的暴露(发布服务)
@Service(version ="1.0",interfaceClass = TestService.class,timeout = 2000)
@Component //创建本地bean
public class TestServiceimpl implements TestService {

    @Override
    public String getHw() {
        return "helloword";
    }

    @Override
    public String getHw2() {
        return "helloword2";
    }
}
