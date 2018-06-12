package com.xq.cloud.hystrix;

import com.xq.cloud.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * com.xq.cloud.hystrix
 *
 * @author zhangpeng32
 * Created on 2018/6/12 上午10:35
 * @Description:
 */
@Component
public class HelloWorldFallback implements HelloService {
    Logger logger= LoggerFactory.getLogger(getClass());

    @Override
    public String sayHiFromClientOne(String name) {
        logger.info("服务端调用异常，走服务降级处理！");
        return "hello fallback!";
    }
}
