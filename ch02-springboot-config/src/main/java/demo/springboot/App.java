package demo.springboot;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot的启动类
 *
 * spring boot 设置配置属性加载顺序
 *  1.命令行参数
 *  2.java:comp/env 里的 JNDI 属性
 *  3.JVM 系统属性
 *  4.操作系统环境变量
 *  5.RandomValuePropertySource 属性类生成的 random.* 属性
 *  6.应用以外的 application.properties（或 yml）文件
 *  7.打包在应用内的 application.properties（或 yml）文件
 *  8.在应用 @Configuration 配置类中，用 @PropertySource 注解声明的属性文件
 *  9.SpringApplication.setDefaultProperties 声明的默认属性
 *
 */
@SpringBootApplication
@EnableSwagger2Doc // 开启 Swagger
public class App 
{
    public static void main( String[] args )
    {

        SpringApplication.run(App.class, args);
    }
}
