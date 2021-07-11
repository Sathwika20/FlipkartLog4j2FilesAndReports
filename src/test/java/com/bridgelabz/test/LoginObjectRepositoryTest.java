package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.LoginObjectRepository;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginObjectRepositoryTest extends Base {
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login into the Application with valid credentials")
    @Test
    public void getLoginIntoApplication() throws InterruptedException, IOException {
        LoginObjectRepository object = new LoginObjectRepository();
        object.getUserCredentials();
    }

}
