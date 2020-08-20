package com.lyc.market.product.web;

import com.lyc.market.product.entity.CategoryEntity;
import com.lyc.market.product.service.CategoryService;
import com.lyc.market.product.vo.Catalog2Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author lyc
 * @date 2020/8/19 17:19
 */
@Controller
public class IndexController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/index/catalog.json")
    @ResponseBody
    public Map<String, List<Catalog2Vo>> getCatalogJson() {

        Map<String, List<Catalog2Vo>> catalogJson = categoryService.getCatalogJson();
        return catalogJson;
    }

    @GetMapping({"/", "/index.html"})
    public String indexPage(Model model) {

        // 查出所有的一级分类
        List<CategoryEntity> categoryEntities = categoryService.getLevel1Categories();
        model.addAttribute("categories", categoryEntities);
        return "index";
    }
}
