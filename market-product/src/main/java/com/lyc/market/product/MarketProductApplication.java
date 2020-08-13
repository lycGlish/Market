package com.lyc.market.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lyc
 * @date 2020/7/27 17:09
 */
@MapperScan("com.lyc.market.product.dao")
@SpringBootApplication
@EnableFeignClients(basePackages = "com.lyc.market.product.feign")
@EnableDiscoveryClient
public class MarketProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketProductApplication.class, args);
    }
}
