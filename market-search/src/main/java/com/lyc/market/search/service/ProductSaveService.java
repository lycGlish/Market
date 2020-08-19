package com.lyc.market.search.service;

import com.lyc.common.to.es.SkuEsModel;

import java.io.IOException;
import java.util.List;

/**
 * @author lyc
 * @date 2020/8/19 15:03
 */
public interface ProductSaveService {
    boolean productStatusUp(List<SkuEsModel> skuEsModels) throws IOException;
}
