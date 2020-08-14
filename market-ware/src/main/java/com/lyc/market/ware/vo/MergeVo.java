package com.lyc.market.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @author lyc
 * @date 2020/8/14 14:55
 */
@Data
public class MergeVo {

    private Long purchaseId;

    private List<Long> items;
}
