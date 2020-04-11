package com.lhj.dubbocloudconsumer.controller;

import com.lhj.dubboapi.service.DemoService;
import com.lhj.dubbocloudconsumer.service.FeignService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Reference(version = "${dubbo.consumer.versoin}")
    private DemoService demoService;

    @Autowired
    private FeignService feignService;

    @GetMapping("demo")
    public String demo(){
        return demoService.helloWorld("helloworld");
    }


    @GetMapping("demo2/{name}")
    public String demo2(@PathVariable String name){
        return feignService.echo(name);
    }
}
