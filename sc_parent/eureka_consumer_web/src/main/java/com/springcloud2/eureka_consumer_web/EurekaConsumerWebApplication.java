package com.springcloud2.eureka_consumer_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableEurekaClient
@SpringBootApplication
public class EurekaConsumerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerWebApplication.class, args);
    }


    //在spirng容器中创建RestTeaplata对象

    @Bean
    @LoadBalanced  //支持使用服务名称发现进行调用,并且支持负载(ribbon)
    public RestTemplate gerRestTemplate(){

        return new RestTemplate();
    }
}
