package com.bridgelabz.base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base {
    public static WebDriver driver;
    public static Logger log = LogManager.getLogger(String.valueOf(Base.class));

    //Before execution
    @BeforeTest
    public void setUp() throws InterruptedException {
        //launches the chromedriver using Webdriver interface
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        log.info("launching chrome broswer");
        //Used to maximise the window
        log.info("Window is maximized");
        driver.manage().window().maximize();
        //Enter the URL of Application
        driver.get("https://www.flipkart.com/");
        log.info("entering application URL");
        Thread.sleep(2000);

    }

    //After execution
    @AfterTest
    public void tearDown() {
        //used to close the current window
        driver.close();
        log.info("Browser is closed");
    }
}


