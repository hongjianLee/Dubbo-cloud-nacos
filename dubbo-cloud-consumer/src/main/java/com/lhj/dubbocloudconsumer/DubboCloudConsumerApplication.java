package com.lhj.dubbocloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DubboCloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboCloudConsumerApplication.class, args);
    }

}
