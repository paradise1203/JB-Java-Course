package org.jblab.util;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author Aidar Shaifutdinov.
 */
@Component
@PropertySource("classpath:vkapi.properties")
public class VkOAuth implements EnvironmentAware {

    private Environment env;

    @Override
    public void setEnvironment(Environment environment) {
        this.env = environment;
    }

    public String version() {
        return env.getProperty("version");
    }

    public String authUrl() {
        return env.getProperty("authUrl");
    }

    public String tokenUrl() {
        return env.getProperty("tokenUrl");
    }

    public String userUrl() {
        return env.getProperty("userUrl");
    }

}
