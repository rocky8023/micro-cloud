package com.xq.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @package: com.xq.cloud.controller
 * @description: TODO
 * @author: zhangpeng32
 * @date: 2018/6/10 22:37
 * @version: 1.0
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/hi")
    public String sayHi(String name){
        return "hi "+ name+", i am from port : "+port;
    }
}
