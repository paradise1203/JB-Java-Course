package org.jblab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Aidar Shaifutdinov.
 */
@Configuration
public class JavaConfig {

    @Bean
    public Set<String> achievements() {
        Set<String> achievements = new HashSet<>();
        achievements.add("1");
        achievements.add("2");
        achievements.add("3");
        return achievements;
    }

}
