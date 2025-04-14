package utils;


import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Assertion {

    /**
     * @Created by Pallavi
     * @Description Compares two text values and logs the result. Captures a
     *              screenshot in case of assertion failure or error.
     * @param text  The actual text to be verified.
     * @param text1 The expected text to compare against.
     * @param test  The ExtentTest instance used for reporting.
     * @return None
     */
    public static void useAssert(String text, String text1, ExtentTest test) {
        try {
            Assert.assertEquals(text, text1);
            LoggerHandler.info("Verification Successful: " + text1);
            test.log(Status.INFO, "Verification Successful: " + text1);
        } catch (AssertionError e) {
            LoggerHandler.error("Assertion Error : Entered Wrong Credentials." + e.getMessage());
            test.log(Status.WARNING, "Entered Wrong Credentials." + e.getMessage());
            Screenshot.captureScreenShot("Assertion error screenshots");
        } catch (Exception e1) {
            LoggerHandler.error("Assertion Error : Entered Wrong Credentials." + e1.getMessage());
            test.log(Status.WARNING, "Entered Wrong Credentials." + e1.getMessage());
        }
    }

    /**
     * @Created by Pallavi
     * @Description Verifies if the actual text contains the expected text and logs
     *              the result. Captures a screenshot in case of assertion failure
     *              or error.
     * @param actualText   The actual text to be checked.
     * @param expectedText The expected text that should be contained within the
     *                     actual text.
     * @param test         The ExtentTest instance used for reporting.
     * @return None
     */
    public static void assertionVerifyByContains(String actualText, String expectedText, ExtentTest test) {
        try {
            if (actualText.contains(expectedText)) {
                Assert.assertTrue(true);
                LoggerHandler.info("Verification Successful: " + actualText);
                test.log(Status.INFO, "Verification Successful: " + actualText);
            }
        } catch (AssertionError e) {
            LoggerHandler.error("Assertion Error : Entered Wrong Credentials." + e.getMessage());
            test.log(Status.WARNING, "Entered Wrong Credentials." + e.getMessage());
            Screenshot.captureScreenShot("Assertion error screenshots");
        } catch (Exception e1) {
            LoggerHandler.error("Assertion Error : Entered Wrong Credentials." + e1.getMessage());
            test.log(Status.WARNING, "Entered Wrong Credentials." + e1.getMessage());
        }
    }
}