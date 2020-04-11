package com.lhj.dubbocloudopenfeignprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DubboCloudOpenfeignProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboCloudOpenfeignProviderApplication.class, args);
    }

}
