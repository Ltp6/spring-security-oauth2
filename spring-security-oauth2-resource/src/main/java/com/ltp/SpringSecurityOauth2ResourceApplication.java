package com.ltp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.ltp.mapper")
public class SpringSecurityOauth2ResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityOauth2ResourceApplication.class, args);
    }

}
