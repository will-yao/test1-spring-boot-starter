package com.xuantuo.portal;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/7
 **/
@ConfigurationProperties(prefix = "demo")
public class DemoProperties {

    private String sayWhat;
    private String toWho;

    public String getSayWhat() {
        return sayWhat;
    }

    public void setSayWhat(String sayWhat) {
        this.sayWhat = sayWhat;
    }

    public String getToWho() {
        return toWho;
    }

    public void setToWho(String toWho) {
        this.toWho = toWho;
    }
}
