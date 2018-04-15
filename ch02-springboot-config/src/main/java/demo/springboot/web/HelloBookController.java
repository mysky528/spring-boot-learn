package demo.springboot.web;

import demo.springboot.config.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaolu on 2018/4/15.
 */
@RestController
public class HelloBookController {

    @Autowired
    BookProperties bookProperties;


    @GetMapping("book/hello")
    public String sayHello()
    {
        return "Hello， " + bookProperties.getWriter() + " is writing "
                + bookProperties.getName() + " ！";
    }
}
