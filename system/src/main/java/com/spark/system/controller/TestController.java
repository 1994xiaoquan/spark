package com.spark.system.controller;


import com.spark.system.domain.Test;
import com.spark.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public List<Test> test(){
        return  testService.list();
    }
}
