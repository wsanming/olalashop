package com.goktech.olala.core.resp;

import java.util.List;

/**
 * @author sanming
 * @Classname RespCategoryVo
 * @Description TODO
 * @Date 2020/12/1
 */
public class RespCategoryVo {

    private String categoryIdArr;
    private String categoryName;
    private String catyDesc;
    private Integer categoryId;
    //    private List<RespCategoryVo> secondList;//二级（三级）
    private List<RespCategoryVo> childList;

    private List<RespBrandVo> brandList;

    public List<RespBrandVo> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<RespBrandVo> brandList) {
        this.brandList = brandList;
    }

    public List<RespCategoryVo> getChildList() {
        return childList;
    }

    public void setChildList(List<RespCategoryVo> childList) {
        this.childList = childList;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryIdArr() {
        return categoryIdArr;
    }

    public void setCategoryIdArr(String categoryIdArr) {
        this.categoryIdArr = categoryIdArr;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCatyDesc() {
        return catyDesc;
    }

    public void setCatyDesc(String catyDesc) {
        this.catyDesc = catyDesc;
    }
}
