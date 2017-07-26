package com.bass.demo.server.manager;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by apple on 2017/7/22.
 */
@FeignClient(name = "provide", fallback = UserRest.UserRestHystrix.class)
public interface UserRest {
    @RequestMapping(method = RequestMethod.GET, value = "/rest")
    String rest(@RequestParam(value = "rest") String rest);

    class UserRestHystrix implements UserRest {

        public String rest(String rest) {
            return "熔断器执行";
        }
    }
}