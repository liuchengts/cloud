package cloud.feign.hystrix;

import cloud.feign.manager.ApiOperationManager;

/**
 * 提供feign方式的ApiOperationManager接口熔断
 */
public class ApiOperationHystrix implements ApiOperationManager {
    public String rest(String rest) {
        return "rest熔断器执行";
    }
}
