package com.bridgelabz.test;

import com.bridgelabz.utility.EmailReports;
import org.testng.annotations.Test;

public class EmailTest {
    @Test
    public static void sendEmail(){
        EmailReports email = new EmailReports();
        email.sendReportsThroughEmail();
    }
}
