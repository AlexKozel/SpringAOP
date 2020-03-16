package com.springAop.springaop.business;

import com.springAop.springaop.DaoOne;
import com.springAop.springaop.aspect.TrackTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessOne {

    @Autowired
    private DaoOne daoOne;

    @TrackTime
    public String calculateSomething() {
        //Business logic

        return daoOne.retrieveSomething();
    }

}
