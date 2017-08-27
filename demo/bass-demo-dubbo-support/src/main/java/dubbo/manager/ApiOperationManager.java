package dubbo.manager;
import common.model.ApiOperation;

/**
 * lc
 * 给web项目提供dubbo服务
 */
public interface ApiOperationManager {
    ApiOperation fandById(Long id);

    ApiOperation save(ApiOperation apiOperation);
    void sendKafka();
}
