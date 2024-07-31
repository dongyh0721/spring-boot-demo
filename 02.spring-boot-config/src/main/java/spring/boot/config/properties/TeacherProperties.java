package spring.boot.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author dongyh
 * @since 2024-07-31 10:53:46
 */
@Data
@Component
@PropertySource(value = "classpath:teacher.yml", factory = YmlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "teacher")
public class TeacherProperties {
    private String name;
    private Integer age;
}
