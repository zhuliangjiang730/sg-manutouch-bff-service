package com.manulife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Manulife Spring Boot 应用程序主类
 */
@SpringBootApplication
public class ManulifeApplication {

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(ManulifeApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
        String port = environment.getProperty("server.port", "8080");
        String appName = environment.getProperty("spring.application.name", "application");
        System.out.println("\n========================================");
        System.out.println("Application [" + appName + "] is running on port: " + port);
        System.out.println("Access URL: http://localhost:" + port);
        System.out.println("========================================\n");
    }

}

