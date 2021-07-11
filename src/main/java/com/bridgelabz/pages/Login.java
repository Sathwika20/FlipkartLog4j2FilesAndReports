package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {

    @FindBy(xpath = "//input[@class = '_2IX_2- VJZDxU']" )
    public WebElement mobileNumber;

    @FindBy(xpath = "//input[@class = '_2IX_2- _3mctLh VJZDxU']")
    public WebElement password;

    @FindBy(xpath = "//button[@class = '_2KpZ6l _2HKlqd _3AWRsL']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class ='exehdJ']")
    public WebElement sathwika;

    //Generate a Constructor
    public Login(WebDriver driver) {
        //This initElements method will create all WebElements
        PageFactory.initElements(driver,this);
    }
    public void getUserName() throws InterruptedException {
        log.info("starting test case");
        log.info("flipkartLoginTest");
        mobileNumber.sendKeys("7989216041");
        password.sendKeys("ABCdef123");
        //click() method is used to click the particular element
        loginButton.click();
        Thread.sleep(2000);
        log.info("flipakrtLoginTest");

    }
    public String getUserText(){
        return this.sathwika.getText();
    }
}

