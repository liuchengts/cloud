package core.service.impl;

import common.model.ApiOperation;
import core.event.SendKafka;
import core.event.Tops;
import core.repository.ApiOperationRepository;
import core.service.ApiOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by apple on 2017/7/21.
 * 实现db的业务接口
 */
@Service("apiOperationService")
public class ApiOperationServiceImpl implements ApiOperationService {
    private final ApiOperationRepository apiOperationRepository;
    private final SendKafka sendKafka;
    @Autowired
    public ApiOperationServiceImpl(ApiOperationRepository apiOperationRepository, SendKafka sendKafka) {
        this.apiOperationRepository = apiOperationRepository;
        this.sendKafka = sendKafka;
    }

    public ApiOperation fandById(Long id) {
        return apiOperationRepository.findOne(id);
    }

    @Transactional
    public ApiOperation  save(ApiOperation apiOperation){
        apiOperation = apiOperationRepository.save(apiOperation);
        if (1==1){
            throw new RuntimeException("自定义异常");
        }
        return  apiOperation;
    }

    public void sendKafka(String c) {
        sendKafka.sendTest(Tops.TEST,c);
    }

}
