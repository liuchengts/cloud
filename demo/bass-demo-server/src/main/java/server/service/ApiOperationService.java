package server.service;


import common.model.ApiOperation;

/**
 * Created by apple on 2017/7/21.
 */
public interface ApiOperationService {

    ApiOperation fandById(Long id);

    ApiOperation save(ApiOperation apiOperation);
    void sendKafka(String c);
}
