package demo.springboot.service.impl;

import demo.springboot.entity.UserInfo;
import demo.springboot.repository.UserInfoDao;
import demo.springboot.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhaolu on 2018/4/15.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}
