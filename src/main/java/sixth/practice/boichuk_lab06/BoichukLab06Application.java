package sixth.practice.boichuk_lab06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.hibernate.autoconfigure.HibernateJpaAutoConfiguration;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
public class BoichukLab06Application {

    public static void main(String[] args) {
        SpringApplication.run(BoichukLab06Application.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "CI/CD pipeline | Boichuk";
    }

}
