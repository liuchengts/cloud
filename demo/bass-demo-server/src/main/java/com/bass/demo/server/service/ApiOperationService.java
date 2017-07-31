package com.bass.demo.server.service;


import com.bass.demo.common.model.ApiOperation;

/**
 * Created by apple on 2017/7/21.
 */
public interface ApiOperationService {

    ApiOperation fandById(Long id);

    ApiOperation save(ApiOperation apiOperation);
}
