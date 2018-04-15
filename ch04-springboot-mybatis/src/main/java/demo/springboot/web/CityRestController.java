package demo.springboot.web;

import demo.springboot.domain.City;
import demo.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaolu on 2018/4/15.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;


    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true)String cityName)
    {
        return cityService.findCityByName(cityName);
    }
}
