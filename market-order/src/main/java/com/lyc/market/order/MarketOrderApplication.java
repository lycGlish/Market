package com.lyc.market.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lyc
 * @date 2020/7/27 18:07
 */
@MapperScan("com.lyc.market.order.dao")
@SpringBootApplication
public class MarketOrderApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(MarketOrderApplication.class, args);
    }
}
