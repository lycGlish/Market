package com.lyc.market.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.common.utils.PageUtils;
import com.lyc.market.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lyc
 * @email 708901735@qq.com
 * @date 2020-07-27 16:45:34
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

