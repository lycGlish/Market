package com.lyc.market.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author lyc
 * @date 2020/8/3 17:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MarketThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Test
    public void testUpload() throws FileNotFoundException {
        // 上传文件流。
        InputStream inputStream = new FileInputStream("C:\\Users\\lenovo\\Desktop\\临时文件\\mc.png");
        ossClient.putObject("market-lyc", "1.png", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传成功.....");
    }
}
