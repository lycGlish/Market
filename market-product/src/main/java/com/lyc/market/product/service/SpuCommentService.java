package com.lyc.market.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.common.utils.PageUtils;
import com.lyc.market.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author lyc
 * @email 708901735@qq.com
 * @date 2020-07-27 16:45:34
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

