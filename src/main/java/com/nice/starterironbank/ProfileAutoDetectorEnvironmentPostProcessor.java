package com.nice.starterironbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author Evgeny Borisov
 */
public class ProfileAutoDetectorEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if (environment.getActiveProfiles().length == 0) {
            if (getTempreture() > -50) {
                environment.addActiveProfile("WINTER_IS_COMING");
            }else {
                environment.addActiveProfile("WINTER_IS_HERE");
            }
        }
    }

    private int getTempreture() {
        return -100;
    }

}
