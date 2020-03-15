package com.springAop.springaop.business;

import com.springAop.springaop.DaoTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessTwo {

    private String name;

    @Autowired
    DaoTwo daoTwo;

    public String calculateSomething() {
        return daoTwo.retrieveSomething();
    }
}
