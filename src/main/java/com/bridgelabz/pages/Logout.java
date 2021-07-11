package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends Base {

    @FindBy(xpath = "//div[@class = '_28p97w']")
    public static WebElement sathwika;

    @FindBy(xpath = "//div[text() = 'Logout']")
    public static WebElement logout;

    @FindBy(xpath = "//div[@class ='exehdJ']")
    public static WebElement more;

    //Generate a constructor
    public Logout(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Actions class is used to hover on to the element
    public void logout() throws InterruptedException {
        log.info("flipkartLogoutTest");
        Actions actions = new Actions(this.driver);
        actions.moveToElement(sathwika).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(logout).click().perform();
        Thread.sleep(3000);
        log.info("ending test case");
        log.info("flipakrtLogoutTest");
    }
    public String getUserText(){
        return this.more.getText();
    }

}

