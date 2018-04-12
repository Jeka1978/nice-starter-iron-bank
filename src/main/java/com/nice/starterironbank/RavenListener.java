package com.nice.starterironbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author Evgeny Borisov
 */
public class RavenListener implements ApplicationListener<ContextRefreshedEvent>{
   @Autowired
   private RavenProperties ravenProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        System.out.println("Raven was sent to "+ravenProperties.getDestination());
    }
}
