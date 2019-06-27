package com.yikeo.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author WuJing
 * @version 0.1
 * @since 2019-06-27
 */

@SpringBootConfiguration
@EnableAutoConfiguration
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
