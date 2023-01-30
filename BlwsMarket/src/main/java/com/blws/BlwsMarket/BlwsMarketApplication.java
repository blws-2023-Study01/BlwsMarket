package com.blws.BlwsMarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
// @ComponentScan(basePackages = { "com.blws.BlwsMarket" })
@ComponentScan("com.blws.BlwsMarket.config")
// @Import({"SecurityConfig.class"})
@MapperScan("com.blws.BlwsMarket.mapper")
public class BlwsMarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlwsMarketApplication.class, args);
    }

}
