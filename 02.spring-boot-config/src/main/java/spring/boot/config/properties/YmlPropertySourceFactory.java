package spring.boot.config.properties;

import jakarta.annotation.Nonnull;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.util.Objects;
import java.util.Properties;

/**
 * @author dongyh
 * @since 2024-07-31 11:22:44
 */
public class YmlPropertySourceFactory implements PropertySourceFactory {
    @Nonnull
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) {
        YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
        factory.setResources(resource.getResource());
        Properties properties = factory.getObject();
        return new PropertiesPropertySource(Objects.requireNonNull(resource.getResource().getFilename()), Objects.requireNonNull(properties));
    }
}
