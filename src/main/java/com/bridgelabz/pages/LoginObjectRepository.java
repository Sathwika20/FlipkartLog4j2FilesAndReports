package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import com.bridgelabz.utility.ObjectRepositoryUtils;
import org.openqa.selenium.By;

import java.io.IOException;

public class LoginObjectRepository extends Base {
    public static void getUserCredentials() throws IOException, InterruptedException {
        ObjectRepositoryUtils utils = new ObjectRepositoryUtils();
        log.info("Give the valid credentials of the user to login into Flipkart");
        driver.findElement(By.xpath(utils.getLoginUserName())).sendKeys("7989216041");
        driver.findElement(By.xpath(utils.getPassword())).sendKeys("ABCdef123");
        driver.findElement(By.xpath(utils.getLoginButton())).click();
        Thread.sleep(2000);
        log.info("End of test case");
    }
}
