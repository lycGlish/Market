package com.lyc.market.search.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lyc
 * @date 2020/8/18 17:49
 */
@Configuration
public class MarketElasticSearchConfig {

    @Bean
    public RestHighLevelClient esRestClient() {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.137.129", 9200, "http")
                )
        );

        return client;
    }
}
