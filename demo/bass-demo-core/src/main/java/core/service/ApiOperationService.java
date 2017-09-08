package core.service;


import common.model.ApiOperation;

/**
 * Created by apple on 2017/7/21.
 * 需要做些业务本项目业务逻辑后再进行db处理的接口声明
 * 当直接调用Repository层无法完成时，就使用这一层
 */
public interface ApiOperationService {

    ApiOperation fandById(Long id);

    ApiOperation save(ApiOperation apiOperation);
    void sendKafka(String c);
}
