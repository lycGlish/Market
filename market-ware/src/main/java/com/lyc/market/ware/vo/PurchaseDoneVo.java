package com.lyc.market.ware.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author lyc
 * @date 2020/8/17 10:38
 */
@Data
public class PurchaseDoneVo {

    // 采购单id
    @NotNull
    private Long id;

    private List<PurchaseItemDoneVo> items;
}
