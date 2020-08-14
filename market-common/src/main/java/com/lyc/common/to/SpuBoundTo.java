package com.lyc.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lyc
 * @date 2020/8/13 10:29
 */
@Data
public class SpuBoundTo {

    private Long spuId;

    private BigDecimal buyBounds;

    private BigDecimal growBounds;
}
