package com.example.hellospringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableTransactionManagement
@EnableSwagger2
public class HellospringbootApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(HellospringbootApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(HellospringbootApplication.class, args);
        LOGGER.info("----------------------服务启动完成-------------------------");
    }
}
