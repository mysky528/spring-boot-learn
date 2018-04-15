package demo.springboot.service;

import demo.springboot.entity.UserInfo;

/**
 * Created by zhaolu on 2018/4/15.
 */
public interface UserInfoService {

    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
