package com.lyc.market.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.common.utils.PageUtils;
import com.lyc.market.product.entity.BrandEntity;
import com.lyc.market.product.entity.CategoryBrandRelationEntity;

import java.util.List;
import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author lyc
 * @email 708901735@qq.com
 * @date 2020-07-27 16:45:34
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

    void updateBrand(Long brandId, String name);

    void updateCategory(Long catId, String name);

    List<BrandEntity> getBrandsByCatId(Long catId);
}

