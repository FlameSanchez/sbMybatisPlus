package com.example.sbmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.sbmybatisplus.mapper")
public class SbMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbMybatisPlusApplication.class, args);
    }

}
