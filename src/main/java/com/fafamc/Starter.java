package com.fafamc;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
public class Starter {
    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(Starter.class);
//        sa.addListeners(new MainBusiListeners());
        sa.run(args);
    }

}
