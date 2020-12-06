package com.goktech.olala.core.service.impl;

import com.goktech.olala.core.resp.RespBrandVo;
import com.goktech.olala.core.resp.RespCategoryVo;
import com.goktech.olala.core.service.IGoodCategory;
import com.goktech.olala.server.dao.goods.BrandMapper;
import com.goktech.olala.server.dao.goods.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanming
 * @Classname GoodCategoryImp
 * @Description
 * @Date 2020/12/1
 */

@Service
public class GoodCategoryImp implements IGoodCategory {
    @Autowired
    CategoryMapper categoryMapper;

    @Autowired
    BrandMapper brandMapper;


    @Override
    public List<RespBrandVo> selectBrand() {
        List<RespBrandVo> respBrandVos = brandMapper.selectBrand();
        return respBrandVos;
    }

    @Override
    public List<RespCategoryVo> beTreeList() {
        List<RespCategoryVo> firstList = categoryMapper.selectByCategory();

        List<RespCategoryVo> secondList=null;

        List<RespCategoryVo> threeList=null;


        for(RespCategoryVo first:firstList){
            String categoryIdArr = first.getCategoryIdArr();
            String[] split = categoryIdArr.split(",");
            secondList=new ArrayList<>();
            for(String cateId:split){
                Integer categoryId = Integer.valueOf(cateId);
                // 根据 categoryId 查询二级目录List
                List<RespCategoryVo> child = categoryMapper.selectByA(categoryId);
                if(child!=null){
                    for(RespCategoryVo second:child){
                        Integer categoryId1 = second.getCategoryId();
                        threeList = categoryMapper.selectByA(categoryId1);
                        second.setChildList(threeList);
                    }
                    secondList.addAll(child);
                }
            }
            first.setChildList(secondList);
        }
        return firstList;
    }


}
