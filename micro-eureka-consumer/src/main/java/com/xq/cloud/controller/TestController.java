package com.xq.cloud.controller;

import com.xq.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.xq.cloud.controller
 *
 * @author zhangpeng32
 * Created on 2018/6/11 上午10:37
 * @Description:
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return helloService.sayHiFromClientOne(name);
    }
}
