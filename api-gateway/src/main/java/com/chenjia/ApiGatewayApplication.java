package com.chenjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(ApiGatewayApplication.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



