package com.bass.demo.web.dubbo;

import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.bass.demo.common.dubbo.ApiOperationManager;
import org.mvnsearch.spring.boot.dubbo.DubboAutoConfiguration;
import org.mvnsearch.spring.boot.dubbo.DubboBasedAutoConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ytx on 17/5/22.
 * lc
 * dubbo服务声明
 */
@Configuration
@AutoConfigureAfter(DubboAutoConfiguration.class)
public class DubboConfig extends DubboBasedAutoConfiguration {
    @Value("${dubbo.timeout}")
    private Integer timeout;//dubbo超时时间  3000ms
    @Value("${dubbo.check}")
    private Boolean check;//是否检查dubbo服务true表示检查 否则不检查

    @Bean
    public ReferenceBean apiOperationManager() {
        ReferenceBean referenceBean = getConsumerBean(ApiOperationManager.class, "", timeout);
        //不启动检查
        referenceBean.setCheck(null==check?true:check);
        return referenceBean;
    }


}
