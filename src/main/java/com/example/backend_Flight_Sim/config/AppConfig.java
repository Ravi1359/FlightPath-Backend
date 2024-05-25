package com.example.backend_Flight_Sim.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Configuration class for the Flight Simulator application.
 * This class defines beans that will be managed by the Spring container.
 */
@Configuration
public class AppConfig {

    /**
     * Creates and configures a {@link RestTemplate} bean.
     * <p>
     * The {@link RestTemplate} is used to make HTTP requests to RESTful web services.
     * </p>
     *
     * @return a configured {@link RestTemplate} instance.
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
