package com.xq.cloud.controller;

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

    @GetMapping(value = "/sayHi")
    public String sayHi(String name){
        return "hello "+ name;
    }
}
