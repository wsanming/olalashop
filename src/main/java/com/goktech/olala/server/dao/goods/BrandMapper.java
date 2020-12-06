package com.goktech.olala.server.dao.goods;

import com.goktech.olala.core.resp.RespBrandVo;
import com.goktech.olala.server.pojo.goods.Brand;
import java.util.List;

public interface BrandMapper {
    int deleteByPrimaryKey(Short brandId);

    int insert(Brand record);

    Brand selectByPrimaryKey(Short brandId);

    List<Brand> selectAll();

    int updateByPrimaryKey(Brand record);

    /**
     * 查品牌名
     * @return
     */
    List<RespBrandVo> selectBrand();
}