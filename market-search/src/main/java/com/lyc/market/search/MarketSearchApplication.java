package com.lyc.market.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lyc
 * @date 2020/8/18 17:48
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class MarketSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketSearchApplication.class, args);
    }
}
