package com.learn;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LongTest extends BaseTest {

    @Test
    public void facebookTest() throws InterruptedException {
        Reporter.log(String.format("Facebook Test Started %s", Thread.currentThread().getId()), true);
        getDriver().navigate().to("http://www.facebook.com");
        Thread.sleep(30000L);
        Assert.assertEquals(getDriver().getTitle(), "Facebook – log in or sign up");
        Reporter.log(String.format("Facebook Test Ended %s", Thread.currentThread().getId()), true);
    }

}
