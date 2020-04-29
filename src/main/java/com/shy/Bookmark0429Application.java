package com.shy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.shy.mapper")
@SpringBootApplication
public class Bookmark0429Application {

    public static void main(String[] args) {
        SpringApplication.run(Bookmark0429Application.class, args);
    }

}
