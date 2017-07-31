package com.bass.demo.server.dubbo;

import com.alibaba.dubbo.config.annotation.DubboService;
import com.bass.demo.common.dubbo.ApiOperationManager;
import com.bass.demo.common.model.ApiOperation;
import com.bass.demo.server.service.ApiOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by apple on 2017/7/30.
 */
@Component
@DubboService(interfaceClass = ApiOperationManager.class)
public class ApiOperationManagerImpl implements ApiOperationManager{
    private final ApiOperationService apiOperationService;

    @Autowired
    public ApiOperationManagerImpl(ApiOperationService apiOperationService) {
        this.apiOperationService = apiOperationService;
    }

    public ApiOperation fandById(String id) {
        return apiOperationService.fandById(id);
    }

    public ApiOperation save(ApiOperation apiOperation) {
        return  apiOperationService.save(apiOperation);
    }
}
