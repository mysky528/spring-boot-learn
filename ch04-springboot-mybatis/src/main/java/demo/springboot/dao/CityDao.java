package demo.springboot.dao;

import demo.springboot.domain.City;
import org.apache.ibatis.annotations.Param;

/**
 * 城市 DAO 接口类
 *
 * Created by zhaolu on 2018/4/15.
 */
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
}
