package demo.springboot.service.impl;

import demo.springboot.dao.CityDao;
import demo.springboot.domain.City;
import demo.springboot.service.CityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 * Created by zhaolu on 2018/4/15.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName)
    {
        return cityDao.findByName(cityName);
    }

}
