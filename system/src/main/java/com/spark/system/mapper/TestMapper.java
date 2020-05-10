package com.spark.system.mapper;

import com.spark.system.domain.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {
    List<Test> list();
}
