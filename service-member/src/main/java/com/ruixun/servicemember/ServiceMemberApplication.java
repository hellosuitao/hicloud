package com.ruixun.servicemember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
public class ServiceMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMemberApplication.class, args);
    }

}
