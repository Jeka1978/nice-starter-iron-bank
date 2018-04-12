package com.nice.starterironbank;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class Config {
    @Bean
    @OnProdCondition
    @ConditionalOnProperty(name = "raven.destination")
    @ConditionalOnMissingBean
    public RavenListener ravenListener(){
        return new RavenListener();
    }
}
