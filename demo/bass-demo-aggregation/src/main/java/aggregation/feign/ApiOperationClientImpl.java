package aggregation.feign;

import cloud.feign.client.ApiOperationClient;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * Created by apple on 2017/7/30.
 * 这里实现feign接口，可能是调用内部的dubbo接口实现，也有可能是调用其他feign接口实现
 */
@Component
public class ApiOperationClientImpl implements ApiOperationClient {
    @Reference(version = "1.0.0")
    private ApiOperationManager apiOperationManager;

    public String rest(String rest) {
        return rest;
    }

}
