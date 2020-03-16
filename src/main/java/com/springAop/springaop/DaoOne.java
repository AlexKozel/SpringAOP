package com.springAop.springaop;

import com.springAop.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DaoOne {

    @TrackTime
    public String retrieveSomething(){
        return "DaoOne";
    }
}
