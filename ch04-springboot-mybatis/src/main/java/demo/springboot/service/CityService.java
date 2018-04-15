package demo.springboot.service;

import demo.springboot.domain.City;

/**
 *
 * 城市业务逻辑接口类
 *
 * Created by zhaolu on 2018/4/15.
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
