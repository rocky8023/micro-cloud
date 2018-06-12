package com.xq.cloud.service;

import com.xq.cloud.hystrix.HelloWorldFallback;
import org.springframework.cloud.openfeign.FeignClient;
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
@FeignClient(name = "eureka-provider",fallback =HelloWorldFallback.class)
public interface HelloService {
    @RequestMapping(path = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
