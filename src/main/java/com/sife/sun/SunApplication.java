package com.sife.sun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sife.sun.dao")
public class SunApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunApplication.class, args);
    }

}
