package com.bass.demo.server.service.feign;

import cloud.feign.manager.ApiOperationManager;
import com.bass.demo.server.event.SendKafka;
import com.bass.demo.server.event.Tops;
import com.bass.demo.server.service.ApiOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by apple on 2017/7/30.
 */
@Component
public class ApiOperationManagerImpl implements ApiOperationManager {

    private final ApiOperationService apiOperationService;
    private final SendKafka sendKafka;

    @Autowired
    public ApiOperationManagerImpl(ApiOperationService apiOperationService, SendKafka sendKafka) {
        this.apiOperationService = apiOperationService;
        this.sendKafka = sendKafka;
    }

    public String rest(String rest) {
        sendKafka.sendTest(Tops.TEST,rest);
        return rest;
    }
}
