package spring.boot.start;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dongyh
 * @since 2024-07-30 14:24:00
 */
@Slf4j
@SpringBootApplication
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class,args);
        log.info("spring boot start success");
    }
}
