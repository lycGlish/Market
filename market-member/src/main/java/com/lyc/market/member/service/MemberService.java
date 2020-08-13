package com.lyc.market.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyc.common.utils.PageUtils;
import com.lyc.market.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author lyc
 * @email 708901735@qq.com
 * @date 2020-07-27 17:47:25
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

