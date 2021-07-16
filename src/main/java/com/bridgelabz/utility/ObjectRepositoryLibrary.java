package com.bridgelabz.utility;

import com.bridgelabz.base.Base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjectRepositoryLibrary extends Base {
    Properties pro;

    public ObjectRepositoryLibrary() throws IOException {
        log.info("Set the path name for the file");
        File src = new File("C:\\Users\\gopir\\IdeaProjects\\ObjectRepository\\config\\config.properties");
        FileInputStream fis = new FileInputStream(src);
        pro = new Properties();
        pro.load(fis);
    }
    public String getUrl(){
        log.info("Provide the URL of the Application");
        return pro.getProperty("FlipkartURL");
    }
    public String getLoginUserName(){
        log.info("Provide the mobileNumber");
        return pro.getProperty("mobileNumber_xpath");
    }
    public String getPassword(){
        log.info("Provide the password");
        return pro.getProperty("password_xpath");
    }
    public String getLoginButton(){
        return pro.getProperty("loginButton_xpath");
    }

}
