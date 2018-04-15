package demo.springboot.web;

import demo.springboot.constant.CityErrorInfoEnum;
import demo.springboot.domain.City;
import demo.springboot.result.GlobalErrorInfoException;
import demo.springboot.result.ResultBody;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 错误码案例
 *
 * Created by zhaolu on 2018/4/15.
 */
@RestController
public class ErrorJsonController {


    /**
     * 获取城市接口
     * @param cityName
     * @return
     * @throws GlobalErrorInfoException
     */
    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public ResultBody findOneCity(@RequestParam("cityName") String cityName) throws GlobalErrorInfoException
    {
        // 入参为空
        if (StringUtils.isEmpty(cityName)) {
            throw new GlobalErrorInfoException(CityErrorInfoEnum.PARAMS_NO_COMPLETE);
        }

        return new ResultBody(new City(1L,2L,"温岭","是我的故乡"));
    }
}
