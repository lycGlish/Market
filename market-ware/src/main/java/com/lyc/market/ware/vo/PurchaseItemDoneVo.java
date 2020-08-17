package com.lyc.market.ware.vo;

import lombok.Data;

/**
 * @author lyc
 * @date 2020/8/17 10:40
 */
@Data
public class PurchaseItemDoneVo {

    private Long itemId;

    private Integer status;

    private String reason;
}
