package com.harry.scm.test.service.impl;

import com.harry.scm.entity.Emp;
import com.harry.scm.test.mapper.EmpMapper;
import com.harry.scm.test.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by harry on 2017/7/27.
 */
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private EmpMapper empDao;

    @Transactional
    public void insertEmp(Emp emp) {
        empDao.insertEmp(emp);
        empDao.insertEmp(emp);
        //throw new RuntimeException("Error");
    }
}
