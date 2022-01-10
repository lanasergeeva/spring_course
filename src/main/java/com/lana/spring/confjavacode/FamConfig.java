package com.lana.spring.confjavacode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:family.properties")
public class FamConfig {

    @Bean
    @Scope("prototype")
    public Husband husBean() {
        return new Husband();
    }

    @Bean
    @Scope("prototype")
    public Wife wifeBean() {
        return new Wife(husBean());
    }
}
