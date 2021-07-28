package com.tian.cloudconsulpayment8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CloudConsulPayment8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsulPayment8002Application.class, args);
    }

}
