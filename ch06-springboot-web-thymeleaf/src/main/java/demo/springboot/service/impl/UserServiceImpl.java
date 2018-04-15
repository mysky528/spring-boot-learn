package demo.springboot.service.impl;

import demo.springboot.domain.User;
import demo.springboot.repository.UserRepository;
import demo.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaolu on 2018/4/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void edit(User user) {
        userRepository.save(user);
    }


    @Override
    public void delete(long id) {
        userRepository.deleteById(Long.valueOf(id));
    }
}
