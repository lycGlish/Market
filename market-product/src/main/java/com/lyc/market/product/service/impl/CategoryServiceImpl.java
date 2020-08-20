package com.lyc.market.product.service.impl;

import com.lyc.market.product.service.CategoryBrandRelationService;
import com.lyc.market.product.vo.Catalog2Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyc.common.utils.PageUtils;
import com.lyc.common.utils.Query;

import com.lyc.market.product.dao.CategoryDao;
import com.lyc.market.product.entity.CategoryEntity;
import com.lyc.market.product.service.CategoryService;
import org.springframework.transaction.annotation.Transactional;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    CategoryBrandRelationService categoryBrandRelationService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        List<CategoryEntity> level1Menus = entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map((menu) -> {
            menu.setChildren(getChildren(menu, entities));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return level1Menus;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 检查当前删除菜单，是否被别的地方引用

        baseMapper.deleteBatchIds(asList);
    }

    /**
     * 找到catalogId的完整路径(三层)
     *
     * @param catalogId
     * @return
     */
    @Override
    public Long[] findCatalogPath(Long catalogId) {
        List<Long> paths = new ArrayList<>();
        List<Long> parentPath = findParentPath(catalogId, paths);
        Collections.reverse(parentPath);

        return parentPath.toArray(new Long[parentPath.size()]);
    }

    /**
     * 级联更新所有关联的数据
     *
     * @param category
     */
    @Transactional
    @Override
    public void updateCascade(CategoryEntity category) {
        this.updateById(category);
        categoryBrandRelationService.updateCategory(category.getCatId(), category.getName());
    }

    @Override
    public List<CategoryEntity> getLevel1Categories() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(
                new QueryWrapper<CategoryEntity>().eq("parent_cid", 0));
        return categoryEntities;
    }

    @Override
    public Map<String, List<Catalog2Vo>> getCatalogJson() {
        // 查出所有一级分类
        List<CategoryEntity> level1Categories = getLevel1Categories();

        // 封装数据
        Map<String, List<Catalog2Vo>> parent_cid = level1Categories.stream().collect(
                Collectors.toMap(k -> k.getCatId().toString(), v -> {
                    List<CategoryEntity> categoryEntities = baseMapper.selectList(
                            new QueryWrapper<CategoryEntity>().eq("parent_id", v.getCatId()));
                    // 封装上面的结果
                    List<Catalog2Vo> catalog2Vos = null;
                    if (categoryEntities != null) {
                        catalog2Vos = categoryEntities.stream().map(l2 -> {
                            Catalog2Vo catalog2Vo = new Catalog2Vo(
                                    v.getCatId().toString(), null, l2.getCatId().toString(), l2.getName());
                            List<CategoryEntity> level3catalog = baseMapper.selectList(
                                    new QueryWrapper<CategoryEntity>().eq("parent_cid", l2.getCatId()));
                            if (level3catalog != null) {
                                List<Catalog2Vo.Catalog3Vo> collect = level3catalog.stream().map(l3 -> {
                                    Catalog2Vo.Catalog3Vo catalog3Vo = new Catalog2Vo.Catalog3Vo(
                                            l2.getCatId().toString(), l3.getCatId().toString(), l3.getName());

                                    return catalog3Vo;
                                }).collect(Collectors.toList());
                                catalog2Vo.setCatalog3List(collect);
                            }

                            return catalog2Vo;
                        }).collect(Collectors.toList());
                    }

                    return catalog2Vos;
                }));
        return parent_cid;
    }

    private List<Long> findParentPath(Long catalogId, List<Long> paths) {
        paths.add(catalogId);
        CategoryEntity byId = this.getById(catalogId);
        if (byId.getParentCid() != 0) {
            findParentPath(byId.getParentCid(), paths);
        }
        return paths;
    }

    // 递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {

        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            // 找子菜单
            categoryEntity.setChildren(getChildren(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            // 菜单的排序
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }
}