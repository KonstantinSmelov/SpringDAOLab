package neostudy;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@RequiredArgsConstructor
public class SpringDaoLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDaoLabApplication.class, args);
    }
}
