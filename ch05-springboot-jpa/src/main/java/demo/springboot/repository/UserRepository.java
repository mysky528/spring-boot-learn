package demo.springboot.repository;

import demo.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhaolu on 2018/4/15.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findById(long id);

    void deleteById(Long id);

}
