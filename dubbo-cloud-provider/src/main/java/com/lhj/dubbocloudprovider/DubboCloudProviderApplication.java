package com.lhj.dubbocloudprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DubboCloudProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboCloudProviderApplication.class, args);
	}

}
