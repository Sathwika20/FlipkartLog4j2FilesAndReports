package com.bridgelabz.listeners;

import com.bridgelabz.base.Base;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.IOException;
import static com.bridgelabz.utility.CaptureScreenShot.takeScreenShot;

public class CustomListeners extends Base implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test cases has started "+result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed " + result.getName());
        log.info("Test is Success");
        try {
            takeScreenShot(result.getName(), "success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test passed " + result.getName());
        log.warn("Test case is failed");
        try {
            takeScreenShot(result.getName(), "Failed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test cases skipped "+result.getName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test cases failed with success percentage "+result.getName());


    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Test cases failed with Timeout "+result.getName());

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test cases started");

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test cases finished");

    }

}
