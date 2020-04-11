package com.lhj.dubbocloudopenfeignconsumer.controller;

import com.lhj.dubbocloudopenfeignconsumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignDemoTestController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/echo-feign/{str}")
    public String feign(@PathVariable String str) {
        return feignService.echo(str);
    }
}
