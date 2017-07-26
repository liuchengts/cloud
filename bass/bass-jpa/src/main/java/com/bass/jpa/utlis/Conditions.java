package com.bass.jpa.utlis;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by ytx on 17/5/18.
 * lc
 * 查询工具类
 */
public class Conditions {

    private Object t;//操作对象
    private List<ConditionsDto> conditionsDtos;//条件

    public Object getT() {
        return t;
    }

    public void setT(Object t) {
        this.t = t;
    }

    public List<ConditionsDto> getConditionsDtos() {
        return conditionsDtos;
    }

    public void setConditionsDtos(List<ConditionsDto> conditionsDtos) {
        this.conditionsDtos = conditionsDtos;
    }

    public void addConditions(ConditionsDto conditionsDto) {
        conditionsDtos = null == conditionsDtos ? new ArrayList<ConditionsDto>() : conditionsDtos;
        conditionsDtos.add(conditionsDto);
    }
}
