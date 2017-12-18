package com.jenkins.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shailendra.singh on 12/18/17.
 *
 */
public class ServiceStatusTest {

    ServiceStatus serviceStatus = null;

    @Before
    public void initTest(){
        serviceStatus = new ServiceStatus();
    }

    @Test
    public void testStatus(){
        Assert.assertEquals("200", serviceStatus.healthCheck());
    }
}
