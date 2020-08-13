package com.lyc.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lyc
 * @date 2020/8/13 10:37
 */
@Data
public class SkuReductionTo {

    private Long skuId;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private int priceStatus;
    private List<MemberPrice> memberPrice;
}
