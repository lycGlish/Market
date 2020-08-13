package com.lyc.market.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lyc
 * @date 2020/8/3 17:29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MarketThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketThirdPartyApplication.class, args);
    }
}
