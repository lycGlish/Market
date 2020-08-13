package com.lyc.market.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.common.utils.PageUtils;
import com.lyc.market.order.entity.OmsOrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author lyc
 * @email 708901735@qq.com
 * @date 2020-07-27 18:06:18
 */
public interface OmsOrderSettingService extends IService<OmsOrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

