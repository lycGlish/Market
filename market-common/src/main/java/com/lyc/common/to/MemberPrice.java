package com.lyc.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lyc
 * @date 2020/8/13 10:42
 */
@Data
public class MemberPrice {
    private Long id;
    private String name;
    private BigDecimal price;
}
