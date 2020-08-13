package com.lyc.market.coupon.dao;

import com.lyc.market.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author lyc
 * @email 708901735@qq.com
 * @date 2020-07-27 17:39:38
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
