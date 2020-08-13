package com.lyc.market.coupon.dao;

import com.lyc.market.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lyc
 * @email 708901735@qq.com
 * @date 2020-07-27 17:39:38
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
