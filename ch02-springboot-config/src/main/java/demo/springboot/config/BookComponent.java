package demo.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 1.通过 @ConfigurationProperties(prefix = "home”) 注解，将配置文件中以 home 前缀的属性值自动绑定到对应的字段中
 * 2.@Component 作为 Bean 注入到 Spring 容器中
 * Created by zhaolu on 2018/4/15.
 */
@Component
@ConfigurationProperties(prefix = "demo.book")
@Validated
public class BookComponent {

    /**
     * 书名
     */
    @NotEmpty
    private String name;

    /**
     * 作者
     */
    @NotNull
    private String writer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
