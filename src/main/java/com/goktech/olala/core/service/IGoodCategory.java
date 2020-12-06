package com.goktech.olala.core.service;

import com.goktech.olala.core.resp.RespBrandVo;
import com.goktech.olala.core.resp.RespCategoryVo;

import java.util.List;

/**
 * @author sanming
 * @Classname IGoodCategory
 * @Description TODO
 * @Date 2020/12/1
 */
public interface IGoodCategory {
    List<RespCategoryVo> beTreeList();

    List<RespBrandVo> selectBrand();
}
