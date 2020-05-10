package com.spark.system.service;

import com.spark.system.domain.Test;
import com.spark.system.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestMapper  testMapper;

    public List<Test> list(){
        return testMapper.list();
    }
}
