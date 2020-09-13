package com.yeyangshu.oa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.yeyangshu.oa.mapper")
public class DubboOaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboOaProviderApplication.class, args);
    }

}
