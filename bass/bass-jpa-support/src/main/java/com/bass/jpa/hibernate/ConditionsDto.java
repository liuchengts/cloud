package com.bass.jpa.hibernate;
/**
 * Created by ytx on 17/5/18.
 * lc
 * 查询工具类
 */
public class ConditionsDto {
    private String field;
    private String field2;
    private String conditions;
    private Object val;
    private Object val0;
    private Object val2;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    public Object getVal0() {
        return val0;
    }

    public void setVal0(Object val0) {
        this.val0 = val0;
    }

    public Object getVal2() {
        return val2;
    }

    public void setVal2(Object val2) {
        this.val2 = val2;
    }

    public ConditionsDto() {
        super();
    }

    public ConditionsDto(String field, String conditions, Object val) {
        this.val = val;
        this.conditions = conditions;
        this.field = field;
    }
    public ConditionsDto(String field, Object val) {
        this.val = val;
        this.field = field;
    }
    public ConditionsDto(String field) {
        this.field = field;
    }

    public ConditionsDto(String field, String field2, String conditions, Object val, Object val2) {
        this.field = field;
        this.field2 = field2;
        this.conditions = conditions;
        this.val = val;
        this.val2 = val2;
    }

    public ConditionsDto(String field, String conditions, Object val, Object val0, Object val2) {
        this.val = val;
        this.val0 = val0;
        this.val2 = val2;
        this.conditions = conditions;
        this.field = field;
    }
}
