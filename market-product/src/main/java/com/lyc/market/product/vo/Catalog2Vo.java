package com.lyc.market.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author lyc
 * @date 2020/8/19 17:43
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Catalog2Vo {

    // 一级父分类id
    private String catalog1Id;

    // 三级子分类
    private List<Catalog3Vo> catalog3List;

    private String id;

    private String name;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class Catalog3Vo{
        // 二级父分类id
        private String catalog2Id;
        private String id;
        private String name;
    }
}
