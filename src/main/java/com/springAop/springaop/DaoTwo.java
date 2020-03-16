package com.springAop.springaop;

import com.springAop.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DaoTwo {

    @TrackTime
    public String retrieveSomething(){
        return "DaoTwo";
    }
}
