package com.lhj.dubbocloudopenfeignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dubbo-cloud-openfeign-provider")
public interface FeignService {

    @GetMapping("/echo/{str}")
    String echo(@PathVariable("str") String str);
}
