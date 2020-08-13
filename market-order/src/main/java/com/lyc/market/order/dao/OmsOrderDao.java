package com.lyc.market.order.dao;

import com.lyc.market.order.entity.OmsOrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lyc
 * @email 708901735@qq.com
 * @date 2020-07-27 18:06:18
 */
@Mapper
public interface OmsOrderDao extends BaseMapper<OmsOrderEntity> {
	
}
