package cloud.feign.hystrix;

import cloud.feign.client.ApiOperationClient;

/**
 * 提供feign方式的ApiOperationManager接口熔断
 */
public class ApiOperationHystrix implements ApiOperationClient {
    public String rest(String rest) {
        return "rest熔断器执行";
    }

    public void sendKafka() {
        System.out.println("sendKafka熔断器执行");
    }
}
