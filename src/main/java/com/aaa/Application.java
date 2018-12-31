package com.aaa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: manong_spring_boot_ssm
 * @description:
 * @author: shaokang
 * @create: 2018-12-29 14:42
 **/
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.aaa.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
