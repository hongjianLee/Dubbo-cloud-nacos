package com.lhj.dubbocloudconsumer.controller;

import com.lhj.dubboapi.service.DemoService;
import com.lhj.dubbocloudconsumer.service.FeignService;
import com.lhj.dubbocloudconsumer.utils.LogAop;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//    dubbo服务
    @Reference(version = "${dubbo.consumer.versoin}")
    private DemoService demoService;

//    cloud的feign服务
    @Autowired
    private FeignService feignService;

    @GetMapping("demo/{echo}")
    @LogAop
    public String demo(@PathVariable String echo){
        return demoService.helloWorld(echo) + "----" + feignService.echo(echo);
    }

}
