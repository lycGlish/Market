package com.lyc.market.search;

import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lyc
 * @date 2020/8/18 17:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MarketElasticSearchTest {

    @Autowired
    private RestHighLevelClient client;

    @Test
    public void contextLoads(){
        System.out.println(client);
    }
}
