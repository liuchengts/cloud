package com.bass.jpa.utlis;


/**
 * Created by ytx on 17/5/18.
 * lc
 * 查询工具类
 */
public class SortDto {
    /**
     * 排序方式
     */
    private String orderType;
    /**
     * 排序字段
     */
    private String orderField;

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public SortDto(String orderType, String orderField) {
        this.orderType = orderType;
        this.orderField = orderField;
    }

}
