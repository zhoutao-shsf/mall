package com.atguigu.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1.引入open-fenigh
 * 2。编写接口告诉springcloud这是一个需要调用远程服务
 * 3.声明接口的每一个方法都是调用远程服务的哪个请求
 * 4。开启远程调用功能
 */
@EnableFeignClients(basePackages = "com.atguigu.mall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
