package demo.springboot.service;

import demo.springboot.domain.User;

import java.util.List;

/**
 * 用户服务类
 *
 * Created by zhaolu on 2018/4/15.
 */
public interface UserService {

    public List<User> getUserList();

    public User findUserById(long id);

    public void save(User user);

    public void edit(User user);

    public void delete(long id);
}
