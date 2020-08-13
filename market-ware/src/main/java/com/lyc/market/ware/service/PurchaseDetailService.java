package com.lyc.market.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.common.utils.PageUtils;
import com.lyc.market.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author lyc
 * @email 708901735@qq.com
 * @date 2020-07-27 18:02:13
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

