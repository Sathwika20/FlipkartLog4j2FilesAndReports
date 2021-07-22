package com.bridgelabz.test;

import com.bridgelabz.utility.EmailReports;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class EmailTest {
    @Description("Sending the emails of reports")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public static void sendEmail(){
        EmailReports email = new EmailReports();
        email.sendReportsThroughEmail();
    }
}
