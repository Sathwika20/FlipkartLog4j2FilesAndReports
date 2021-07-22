package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.listeners.CustomListeners;
import com.bridgelabz.pages.DashBoard;
import com.bridgelabz.pages.Login;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class FlipkartTest extends Base {

    @Description("Flipkart Login Test With Valid Credentials")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        Login login = new Login(Base.driver);
        login.getUserName();
        System.out.println(login.getUserText());
        Assert.assertEquals(login.getUserText(),"Sathwika");
    }
    @Description("Flipkart Logout Test From The User Account")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 2)
    public void logout() throws InterruptedException {
        DashBoard dashBoard = new DashBoard(Base.driver);
        dashBoard.logout();
        System.out.println(dashBoard.getUserText());
        Assert.assertNotEquals(dashBoard.getUserText(),"Sathwika");
    }
}
