package demo.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot Hello案例 提供restful接口服务
 *
 * Created by zhaolu on 2018/4/15.
 */
@RestController
public class HelloBookController {

    /**
     * @RestController：提供实现了REST API，可以服务JSON,XML或者其他。这里是以String的形式渲染出结果
     *
     * @return
     */
    @RequestMapping(value = "/book/hello",method = RequestMethod.GET)
    public String sayHello()
    {
        return "Hello，《Spring Boot 2.x 核心技术实战 - 上 基础篇》！";
    }
}
