package com.lhj.dubbocloudprovider.serviceImpl;

import com.lhj.dubboapi.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "${dubbo.provider.version}", timeout = 10000)
public class DemoServiceImpl implements DemoService {

    @Override
    public String helloWorld(String str) {
        return str;
    }

    @Override
    public String second(String str) {
        return str;
    }
}
