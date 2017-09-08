package cloud.feign.client;


import cloud.feign.hystrix.ApiOperationHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by apple on 2017/7/22.
 * 提供feign接口，对外
 */
@FeignClient(name = "bass-demo-server", fallback = ApiOperationHystrix.class)
public interface ApiOperationClient {
    @RequestMapping(method = RequestMethod.GET, value = "/rest")
    String rest(@RequestParam(value = "rest") String rest);
}