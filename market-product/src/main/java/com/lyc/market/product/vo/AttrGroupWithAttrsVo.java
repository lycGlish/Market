package com.lyc.market.product.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.lyc.market.product.entity.AttrEntity;
import lombok.Data;

import java.util.List;

/**
 * @author lyc
 * @date 2020/8/12 16:02
 */
@Data
public class AttrGroupWithAttrsVo {

    /**
     * 分组id
     */
    private Long attrGroupId;
    /**
     * 组名
     */
    private String attrGroupName;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 描述
     */
    private String descript;
    /**
     * 组图标
     */
    private String icon;
    /**
     * 所属分类id
     */
    private Long catalogId;

    private List<AttrEntity> attrs;
}
