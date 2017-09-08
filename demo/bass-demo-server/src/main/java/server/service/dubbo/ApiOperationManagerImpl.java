package server.service.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import common.model.ApiOperation;
import core.service.ApiOperationService;
import manager.ApiOperationManager;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by apple on 2017/7/30.
 * 实现dubbo接口
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
        ApiOperation apiOperation=apiOperationService.fandById(1l);
        apiOperationService.sendKafka(apiOperation.getContent()+"| Dubbo");
    }
}
