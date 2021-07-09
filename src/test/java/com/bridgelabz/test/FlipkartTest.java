package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.listeners.CustomListeners;
import com.bridgelabz.pages.Login;
import com.bridgelabz.pages.Logout;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class FlipkartTest extends Base {
    @Description("Flipkart Login Test With Valid Credentials")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void LoginTest() throws InterruptedException {
        Login login = new Login(driver);
        login.getUserName();
    }
    @Description("Flipkart Logout Test From The User Account")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 2)
    public static void logout() throws InterruptedException {
        Logout logout = new Logout(driver);
        logout.logout();
    }
}
