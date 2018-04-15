package demo.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  Spring Boot Hello案例
 *
 * Created by zhaolu on 2018/4/15.
 */
@Controller
public class HelloController {


    /**
     * @RequestMapping：提供路由信息，"/hello“路径的HTTP Request都会被映射到sayHello方法进行处理。
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello()
    {
        return "Hello，Spring Boot！";
    }


}
