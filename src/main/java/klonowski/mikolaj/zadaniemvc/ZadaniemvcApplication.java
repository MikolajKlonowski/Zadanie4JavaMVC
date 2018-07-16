package klonowski.mikolaj.zadaniemvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class ZadaniemvcApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ZadaniemvcApplication.class, args);
context.getBean(Kontroler.class);


    }
}
