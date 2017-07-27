package com.harry.scm.test.mapper;

import com.harry.scm.entity.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by harry on 2017/7/27.
 */
@Repository
public interface EmpMapper {
    void insertEmp(Emp emp);
}
