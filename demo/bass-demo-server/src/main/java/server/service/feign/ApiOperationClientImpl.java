package server.service.feign;

import cloud.feign.client.ApiOperationClient;
import server.event.SendKafka;
import server.event.Tops;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import server.service.ApiOperationService;

/**
 * Created by apple on 2017/7/30.
 */
@Component
public class ApiOperationClientImpl implements ApiOperationClient {

    private final ApiOperationService apiOperationService;
    private final SendKafka sendKafka;

    @Autowired
    public ApiOperationClientImpl(ApiOperationService apiOperationService, SendKafka sendKafka) {
        this.apiOperationService = apiOperationService;
        this.sendKafka = sendKafka;
    }

    public String rest(String rest) {
        sendKafka.sendTest(Tops.TEST,rest);
        return rest;
    }
}
