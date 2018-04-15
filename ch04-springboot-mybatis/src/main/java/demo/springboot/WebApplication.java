package demo.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 应用启动类
 *
 */
@SpringBootApplication
//mapper 接口类扫描包配置
@MapperScan("demo.springboot.dao")
public class WebApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(WebApplication.class, args);
    }
}
