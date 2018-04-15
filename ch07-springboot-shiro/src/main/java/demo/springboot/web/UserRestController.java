package demo.springboot.web;

import demo.springboot.domain.User;
import demo.springboot.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhaolu on 2018/4/15.
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserRestController {

    @Resource
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> list()
    {
        List<User> users=userService.getUserList();
        return users;
    }




}
