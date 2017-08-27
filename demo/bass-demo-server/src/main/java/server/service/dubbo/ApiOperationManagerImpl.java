package server.service.dubbo;

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

    @Autowired
    public ApiOperationManagerImpl(ApiOperationService apiOperationService) {
        this.apiOperationService = apiOperationService;
    }

    public ApiOperation fandById(Long id) {
        return apiOperationService.fandById(id);
    }

    public ApiOperation save(ApiOperation apiOperation) {
        return apiOperationService.save(apiOperation);
    }

    public void sendKafka() {
        apiOperationService.sendKafka();
    }
}
