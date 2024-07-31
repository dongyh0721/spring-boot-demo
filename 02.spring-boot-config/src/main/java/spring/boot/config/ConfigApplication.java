package spring.boot.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dongyh
 * @since 2024-07-30 14:24:00
 */
@Slf4j
@SpringBootApplication(scanBasePackages = "spring.boot.config")
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }


}
