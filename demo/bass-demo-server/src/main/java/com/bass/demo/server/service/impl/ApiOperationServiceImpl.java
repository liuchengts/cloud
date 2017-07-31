package com.bass.demo.server.service.impl;

import com.bass.demo.common.model.ApiOperation;
import com.bass.demo.server.repository.ApiOperationRepository;
import com.bass.demo.server.service.ApiOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 2017/7/21.
 * lc
 * 业务实现层  这里可能会使用rest方式调用其他地方的接口
 */
@Service("apiOperationService")
public class ApiOperationServiceImpl implements ApiOperationService {
    private final ApiOperationRepository apiOperationRepository;

    @Autowired
    public ApiOperationServiceImpl(ApiOperationRepository apiOperationRepository) {
        this.apiOperationRepository = apiOperationRepository;
    }

    public ApiOperation fandById(String id) {
        return apiOperationRepository.findOne(id);
    }
}
