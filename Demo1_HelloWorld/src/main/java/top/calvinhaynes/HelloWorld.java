package top.calvinhaynes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

@RestController
@EnableAutoConfiguration //这个注解告诉 Spring Boot 根据你添加的 jar 依赖“猜测”你想如何配置 Spring。
public class HelloWorld
{
    @RequestMapping("/")
    String home() {
        return "Hello SpringBoot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
    }

}
