package com.malexj.configuration;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.malexj.")
public class AppConfig {

    @Bean
    public Mapper beanMapper() {
        return new DozerBeanMapper();
    }
}
