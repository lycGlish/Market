package com.lyc.market.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lyc
 * @date 2020/7/27 18:04
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class MarketWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketWareApplication.class, args);
    }
}
