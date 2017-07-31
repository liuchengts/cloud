//package com.bass.demo.web.controllers;
//
//import com.bass.demo.common.dubbo.ApiOperationManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
///**
// * Created by apple on 2017/7/21.
// * lc
// * web服务 为页面提供服务
// */
//@Controller
//@RequestMapping("/api")
//public class DemoController {
//    private final ApiOperationManager apiOperationManager;
//
//    @Autowired
//    public DemoController(ApiOperationManager apiOperationManager) {
//        this.apiOperationManager = apiOperationManager;
//    }
//
//    @RequestMapping("/fandById/{id}")
//    public String fandById(@PathVariable("id") String id, ModelMap model) {
//        model.put("couponBatch", apiOperationManager.fandById(id));
//        return "api/index";
//    }
//}
