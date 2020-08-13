package com.lyc.market.member.feign;

import com.lyc.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lyc
 * @date 2020/7/28 11:14
 */
@FeignClient("market-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
