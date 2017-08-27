package server.service.dubbo;

import cloud.feign.client.ApiOperationClient;
import com.alibaba.dubbo.config.annotation.Service;
import common.model.ApiOperation;
import dubbo.manager.ApiOperationManager;
import org.springframework.beans.factory.annotation.Autowired;
import server.service.ApiOperationService;

/**
 * Created by apple on 2017/7/30.
 */
@Service(version = "1.0.0")
public class ApiOperationManagerImpl implements ApiOperationManager {

    private final ApiOperationService apiOperationService;
    private final ApiOperationClient apiOperationClient;
    @Autowired
    public ApiOperationManagerImpl(ApiOperationService apiOperationService, ApiOperationClient apiOperationClient) {
        this.apiOperationService = apiOperationService;
        this.apiOperationClient = apiOperationClient;
    }

    public ApiOperation fandById(Long id) {
        return apiOperationService.fandById(id);
    }

    public ApiOperation save(ApiOperation apiOperation) {
        return apiOperationService.save(apiOperation);
    }

    public void sendKafka() {
        ApiOperation apiOperation=apiOperationService.fandById(1l);
        apiOperationService.sendKafka(apiOperation.getContent()+"| Dubbo");
        apiOperationClient.sendKafka();
    }
}
