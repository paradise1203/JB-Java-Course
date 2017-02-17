package org.jblab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author aleksandrpliskin on 14.12.16.
 */
@Configuration
public class AppConfiguration {

    @Bean
    Guitar guitar() {
        return new Guitar();
    }

}
