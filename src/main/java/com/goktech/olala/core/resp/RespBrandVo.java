package com.goktech.olala.core.resp;

/**
 * @author sanming
 * @Classname RespBrandVo
 * @Description TODO
 * @Date 2020/12/4
 */
public class RespBrandVo {
    private String brandName;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "RespBrandVo{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
