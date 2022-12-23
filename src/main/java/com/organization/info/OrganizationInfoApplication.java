package com.organization.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class OrganizationInfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrganizationInfoApplication.class, args);
    }

}
