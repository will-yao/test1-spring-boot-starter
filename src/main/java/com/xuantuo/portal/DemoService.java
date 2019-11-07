package com.xuantuo.portal;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/7
 **/
public class DemoService {

    public String sayWhat;
    public String toWho;

    public DemoService(String sayWhat, String toWho) {
        this.sayWhat = sayWhat;
        this.toWho = toWho;
    }

    public String say() {
        return this.sayWhat + "!  " + toWho;
    }
}
