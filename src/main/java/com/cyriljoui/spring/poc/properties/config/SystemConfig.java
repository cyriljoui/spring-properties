package com.cyriljoui.spring.poc.properties.config;

import com.cyriljoui.spring.poc.properties.CustomProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CustomProperties.class)
public class SystemConfig {

    @Bean
    public Object createFakeConfig(CustomProperties config) {
        System.out.println("config A: " + config.getPropertyA());
        System.out.println("config B: " + config.getPropertyB());
        return "FakeString";
    }
}
