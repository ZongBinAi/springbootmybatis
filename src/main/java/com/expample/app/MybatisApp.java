package com.expample.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.expample"})
@MapperScan(basePackages = {"com.expample.mapper"})
@EnableAutoConfiguration
public class MybatisApp {
    public static void main(String[] args){
        SpringApplication.run(MybatisApp.class);
    }
}
