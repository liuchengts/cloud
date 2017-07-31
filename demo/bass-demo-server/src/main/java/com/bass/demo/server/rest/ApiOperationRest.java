package com.bass.demo.server.rest;

import com.bass.demo.server.service.ApiOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by apple on 2017/7/21.
 * lc
 * 给其他项目提供 rest服务
 */
@RestController
@RequestMapping("/apiOperationRest")
public class ApiOperationRest {
    private final ApiOperationService apiOperationService;

    @Autowired
    public ApiOperationRest(ApiOperationService apiOperationService) {
        this.apiOperationService = apiOperationService;
    }

    @RequestMapping("/fandById/{id}")
    public Object fandById(@PathVariable("id") Long id) {
        return apiOperationService.fandById(id);
    }
}
