package com.lyc.market.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lyc
 * @date 2020/7/28 14:30
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class MarketGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketGatewayApplication.class, args);
    }
}
