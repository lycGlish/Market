package com.lyc.market.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lyc
 * @date 2020/7/27 17:49
 */
@MapperScan("com.lyc.market.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.lyc.market.member.feign")
public class MarketMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketMemberApplication.class, args);
    }
}
