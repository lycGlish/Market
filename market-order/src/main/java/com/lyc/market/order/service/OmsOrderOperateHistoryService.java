package com.lyc.market.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.common.utils.PageUtils;
import com.lyc.market.order.entity.OmsOrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author lyc
 * @email 708901735@qq.com
 * @date 2020-07-27 18:06:18
 */
public interface OmsOrderOperateHistoryService extends IService<OmsOrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

