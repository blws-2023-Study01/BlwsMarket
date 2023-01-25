package com.blws.BlwsMarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.blws.BlwsMarket.mapper")
public class BlwsMarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlwsMarketApplication.class, args);
    }

}