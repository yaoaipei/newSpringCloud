package com.k9507.dubbo.dubbocomsumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubboConfiguration
@SpringBootApplication
public class DubboComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboComsumerApplication.class, args);
    }

}
