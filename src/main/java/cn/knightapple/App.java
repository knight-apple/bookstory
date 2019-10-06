package cn.knightapple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(App.class);
        sa.run(args);
    }
}
