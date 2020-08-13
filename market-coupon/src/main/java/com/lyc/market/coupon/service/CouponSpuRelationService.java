package com.lyc.market.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.common.utils.PageUtils;
import com.lyc.market.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author lyc
 * @email 708901735@qq.com
 * @date 2020-07-27 17:39:38
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

