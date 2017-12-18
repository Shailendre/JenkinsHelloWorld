package com.jenkins.test;

/**
 * Created by shailendra.singh on 12/18/17.
 *
 * Service class
 */
public class ServiceStatus {

    private final String STATUS_OK = "200";

    public String healthCheck(){
        return STATUS_OK;
    }


}
