package com.lwh.learning.ss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author lwh
 * @date 2025-03-30 18:38:54
 * @describe -
 */
@MapperScan(value = "com.lwh.learning.ss.mapper")
@SpringBootApplication
public class SSApplication {

    public static void main(String[] args) {
        SpringApplication.run(SSApplication.class, args);
    }
}
