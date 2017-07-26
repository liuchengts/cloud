package com.bass.support.dubbo;

import org.mvnsearch.spring.boot.dubbo.DubboAutoConfiguration;
import org.mvnsearch.spring.boot.dubbo.DubboBasedAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ytx on 17/5/22.
 * lc
 * dubbo服务声明
 */
@Configuration
@AutoConfigureAfter(DubboAutoConfiguration.class)
public class DubboConfig extends DubboBasedAutoConfiguration {

}
