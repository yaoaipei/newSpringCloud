package com.k9507.dubbo.dubboprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


//开启dubbo
@EnableDubboConfiguration
//(exclude = DataSourceAutoConfiguration.class)
//@MapperScan(value = "com.k9507.dubbo.dubboprovider.mapper")
@MapperScan(value = "com.k9507.dubbo.dubboprovider.mapper")
@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }

}
