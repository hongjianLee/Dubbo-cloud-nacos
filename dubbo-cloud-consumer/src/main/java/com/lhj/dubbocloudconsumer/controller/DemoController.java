package com.lhj.dubbocloudconsumer.controller;

import com.lhj.dubboapi.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Reference(version = "${dubbo.consumer.versoin}")
    private DemoService demoService;


    @GetMapping("demo")
    public String demo(){
        return demoService.helloWorld("helloworld");
    }
}
