package com.lhj.dubbocloudconsumer.service;

import com.alibaba.cloud.dubbo.annotation.DubboTransported;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dubbo-cloud-openfeign-provider")
@DubboTransported(protocol = "dubbo")
public interface FeignService {

    @GetMapping("/echo/{str}")
    String echo(@PathVariable("str") String str);
}
