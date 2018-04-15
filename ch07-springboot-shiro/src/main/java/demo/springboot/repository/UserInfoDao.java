package demo.springboot.repository;

import demo.springboot.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zhaolu on 2018/4/15.
 */
public interface UserInfoDao extends CrudRepository<UserInfo,Long> {

    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
