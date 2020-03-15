package com.springAop.springaop;

import org.springframework.stereotype.Repository;

@Repository
public class DaoTwo {

    public String retrieveSomething(){
        return "DaoTwo";
    }
}
