package com.lyc.market.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lyc
 * @date 2020/7/27 17:41
 */
@MapperScan("com.lyc.market.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class MarketCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketCouponApplication.class, args);
    }
}
