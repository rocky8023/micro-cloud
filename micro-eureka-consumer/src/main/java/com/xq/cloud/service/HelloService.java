package com.xq.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * com.xq.cloud.service
 *
 * @author zhangpeng32
 * Created on 2018/6/11 上午10:34
 * @Description:
 */
@FeignClient(value = "eureka-provider")
public interface HelloService {
    @RequestMapping(path = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
