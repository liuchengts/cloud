package com.bass.demo.server.dubbo;

import com.alibaba.dubbo.config.annotation.DubboService;
import com.bass.demo.common.dubbo.ApiOperationManager;
import com.bass.demo.common.model.ApiOperation;
import org.springframework.stereotype.Component;

/**
 * Created by apple on 2017/7/30.
 */
@Component
@DubboService(interfaceClass = ApiOperationManager.class)
public class ApiOperationManagerImpl implements ApiOperationManager{
    public ApiOperation fandById(String s) {
        return null;
    }
}
