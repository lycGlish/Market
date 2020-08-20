package com.lyc.market.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lyc.market.product.entity.BrandEntity;
import com.lyc.market.product.service.BrandService;
import com.lyc.market.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author lyc
 * @date 2020/7/27 17:14
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MarketProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    private CategoryService categoryService;

//    @Autowired
//    OSSClient ossClient;

    @Test
    public void testFindPath(){
        Long[] catalogPath = categoryService.findCatalogPath(225L);
        log.info("完整路径：{}", Arrays.asList(catalogPath));
    }

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功.....");

//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("苹果");
//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item) -> {
            System.out.println(item);
        });
    }
}
