package com.bass.demo.web.controllers;

import com.bass.demo.common.dubbo.ApiOperationManager;
import com.bass.demo.common.model.ApiOperation;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by apple on 2017/7/21.
 * lc
 * web服务 为页面提供服务
 */
@Controller
@RequestMapping("/api")
public class DemoController {
    @Reference
    private ApiOperationManager apiOperationManager;

    @RequestMapping("/fandById/{id}")
    public String fandById(@PathVariable("id") Long id, ModelMap model) {
        ApiOperation apiOperation = apiOperationManager.fandById(id);
        model.put("apiOperation", apiOperation);
        return "api/index";
    }

    @RequestMapping("/save/{id}")
    @ResponseBody
    public Object save(@PathVariable("id") Long id) {
        ApiOperation api = apiOperationManager.fandById(id);
        api.setId(id + 1);
//        ApiOperation api=new ApiOperation();
//        api.setId(id+1);
//        api.setApi(apiOperation.getApi());
//        api.setContent(apiOperation.getContent());
//        api.setOkNo(apiOperation.getOkNo());
//        api.setResult(apiOperation.getResult());
//        api.setTime(apiOperation.getTime());
        return apiOperationManager.save(api);
    }
}
