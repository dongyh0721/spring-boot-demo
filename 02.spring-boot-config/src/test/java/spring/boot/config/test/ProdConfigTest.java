package spring.boot.config.test;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import spring.boot.config.ConfigApplication;
import spring.boot.config.properties.StudentProperties;
import spring.boot.config.properties.TeacherProperties;

/**
 * @author dongyh
 * @since 2024-07-31 11:16:46
 */
@Slf4j
@SpringBootTest(classes = ConfigApplication.class, args = {"--spring.profiles.include=prod,prod-server"})
public class ProdConfigTest {
    @Value("${title}")
    private String title;
    @Value("${server-name}")
    private String serverName;
    @Resource
    private TeacherProperties teacherProperties;
    @Resource
    private StudentProperties studentProperties;

    @Test
    void run() {
        log.info("prod title:{}", title);
        log.info("prod server name:{}", serverName);
        log.info("teacher [name:{},age:{}]", teacherProperties.getName(), teacherProperties.getAge());
        log.info("student [name:{},age:{}]", studentProperties.getName(), studentProperties.getAge());
    }
}
