package com.lyc.market.product.dao;

import com.lyc.market.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lyc
 * @email 708901735@qq.com
 * @date 2020-07-27 16:45:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
