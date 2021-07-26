package top.calvinhaynes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration
public class Demo2JdbcDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo2JdbcDruidApplication.class, args);
    }

}
