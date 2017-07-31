package com.bass.demo.common.dubbo;

import com.bass.demo.common.model.ApiOperation;

/**
 * Created by apple on 2017/7/21.
 * lc
 * 给web项目提供dubbo服务
 */
public interface ApiOperationManager {
    ApiOperation fandById(String id);

    ApiOperation save(ApiOperation apiOperation);
}
