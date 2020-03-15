package com.springAop.springaop;

import org.springframework.stereotype.Repository;

@Repository
public class DaoOne {

    public String retrieveSomething(){
        return "DaoOne";
    }
}
