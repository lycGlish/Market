package com.lyc.market.product.feign;

import com.lyc.common.to.SkuHasStockVo;
import com.lyc.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author lyc
 * @date 2020/8/19 14:34
 */
@FeignClient("market-ware")
public interface WareFeignService {

    @PostMapping("/ware/waresku/hasstock")
    R getSkusHasStock(@RequestBody List<Long> skuIds);
}
