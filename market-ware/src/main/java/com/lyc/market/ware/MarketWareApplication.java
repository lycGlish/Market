package com.lyc.market.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author lyc
 * @date 2020/7/27 18:04
 */
@MapperScan("com.lyc.market.ware.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
public class MarketWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketWareApplication.class, args);
    }
}
