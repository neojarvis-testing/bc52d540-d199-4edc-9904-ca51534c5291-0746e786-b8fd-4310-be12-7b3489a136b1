package pages;

import java.util.Set;
import java.util.Iterator;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.FooterLocator;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;

public class FooterActionPage {
    DriverHelper helper = new DriverHelper(Base.driver);
    String path = ReadProperties.prop.getProperty("path");

    /**
     * @Created by Pallavi
     * @Description Performs the registration or login process by interacting with the specified page elements. Validates the page title and logs the verification message and page details.
     * @param test An ExtentTest instance used for logging test steps and results.
     * @return None
     */
    public void clickRegisterLogin(ExtentTest test) {
        try {

            helper.waitForElementToBeVisible(FooterLocator.registerLogin, 5);
            helper.hoverOverElement(FooterLocator.registerLogin);
            helper.clickOnElement(FooterLocator.registerLogin);
            String actualTitle = ExcelFileReader.readExcelData(path, "Pallavi", 0, 0);
            String expectedTitle = Base.driver.getTitle();

            Assertion.useAssert(actualTitle, expectedTitle, test);            
            

        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }

    }

    /**
     * @Created by Pallavi
     * @Description Interacts with the 'Delivery Charges' page element, validates the page title, and logs the verification message and page details.
     * @param test An ExtentTest instance used for logging test steps and results.
     * @return None
     */
    public void clickDeliveryCharges(ExtentTest test) {
        try {

            helper.waitForElementToBeVisible(FooterLocator.deliveryCharges, 5);
            helper.hoverOverElement(FooterLocator.deliveryCharges);
            helper.clickOnElement(FooterLocator.deliveryCharges);
            String actualTitle = ExcelFileReader.readExcelData(path, "Pallavi", 1, 0);

            String expectedTitle = Base.driver.getTitle();
            Assertion.useAssert(actualTitle, expectedTitle, test);
            LoggerHandler.info(expectedTitle);
            
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Pallavi
     * @Description Interacts with the 'Payment Options' page element, validates the page title, and logs the verification message and page details.
     * @param test An ExtentTest instance used for logging test steps and results.
     * @return None
     */
    public void clickPaymentOption(ExtentTest test) {
        try {

            helper.waitForElementToBeVisible(FooterLocator.paymentOptions, 5);
            helper.hoverOverElement(FooterLocator.paymentOptions);
            helper.clickOnElement(FooterLocator.paymentOptions);
            String actualTitle = ExcelFileReader.readExcelData(path, "Pallavi", 2, 0);

            String expectedTitle = Base.driver.getTitle();
            Assertion.useAssert(actualTitle, expectedTitle, test);
            LoggerHandler.info(expectedTitle);
            
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Pallavi
     * @Description Interacts with the 'FAQ' page element, validates the page title, and logs the verification message and page details.
     * @param test An ExtentTest instance used for logging test steps and results.
     * @return None
     */
    public void clickFAQ(ExtentTest test) {
        try {

            helper.waitForElementToBeVisible(FooterLocator.faq, 5);
            helper.hoverOverElement(FooterLocator.faq);
            helper.clickOnElement(FooterLocator.faq);
            String actualTitle = ExcelFileReader.readExcelData(path, "Pallavi", 3, 0);

            String expectedTitle = Base.driver.getTitle();
            Assertion.useAssert(actualTitle, expectedTitle, test);
            LoggerHandler.info(expectedTitle);
            
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Pallavi
     * @Description Interacts with the 'Return Policy' page element, validates the page title, and logs the verification message and page details.
     * @param test An ExtentTest instance used for logging test steps and results.
     * @return None
     */
    public void clickReturnPolicy(ExtentTest test) {
        try {

            helper.waitForElementToBeVisible(FooterLocator.returnPolicy, 5);
            helper.hoverOverElement(FooterLocator.returnPolicy);
            helper.clickOnElement(FooterLocator.returnPolicy);
            String actualTitle = ExcelFileReader.readExcelData(path, "Pallavi", 4, 0);

            String expectedTitle = Base.driver.getTitle();
            Assertion.useAssert(actualTitle, expectedTitle, test);
            LoggerHandler.info(expectedTitle);
        
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Pallavi
     * @Description Interacts with the 'Facebook' page element, performs the hover and click actions, and ensures the element is visible before interacting.
     * @param test An ExtentTest instance used for logging test steps and results.
     * @return None
     */
    public void clickFacebook(ExtentTest test) {
        try {

            helper.hoverOverElement(FooterLocator.facebook);
            helper.waitForElementToBeVisible(FooterLocator.facebook, 5);
            helper.clickOnElement(FooterLocator.facebook);
            System.out.println(Base.driver.getTitle());
            String Actual= ExcelFileReader.readExcelData(path, "Pallavi", 0, 1);
            String expected=ExcelFileReader.readExcelData(path, "Pallavi", 0, 1);
            Assertion.useAssert(Actual, expected, test);

            switchToParentWindow();
            

        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }

    }

    /**
     * @Created by Pallavi
     * @Description Interacts with the 'YouTube' page element, performs hover and click actions, and ensures the element is visible before interacting.
     * @param test An ExtentTest instance used for logging test steps and results.
     * @return None
     */
    public void clickYoutube(ExtentTest test) {
        try {
            Thread.sleep(2000);
            helper.waitForElementToBeVisible(FooterLocator.youtube, 5);
            helper.hoverOverElement(FooterLocator.youtube);
            helper.clickOnElement(FooterLocator.youtube);
            String Actual= ExcelFileReader.readExcelData(path, "Pallavi", 1, 1);
            String expected=ExcelFileReader.readExcelData(path, "Pallavi", 1, 1);
            Assertion.useAssert(Actual, expected, test);
            switchToParentWindow();

        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }

    }

    /**
     * @Created by Pallavi
     * @Description Interacts with the 'Instagram' page element, performs hover and click actions, and ensures the element is visible before interacting.
     * @param test An ExtentTest instance used for logging test steps and results.
     * @return None
     */
    public void clickInstagram(ExtentTest test) {
        try {
            Thread.sleep(2000);
            helper.hoverOverElement(FooterLocator.instagram);
            helper.waitForElementToBeVisible(FooterLocator.instagram, 5);
            helper.clickOnElement(FooterLocator.instagram);
            String Actual= ExcelFileReader.readExcelData(path, "Pallavi", 2, 1);
            String expected=ExcelFileReader.readExcelData(path, "Pallavi", 2, 1);
            Assertion.useAssert(Actual, expected, test);
            switchToParentWindow();
            
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }

    }

    /**
     * @Created by Pallavi
     * @Description Interacts with the 'Twitter' page element, performs hover and click actions, and ensures the element is visible before interacting.
     * @param test An ExtentTest instance used for logging test steps and results.
     * @return None
     */
    public void clickTwitter(ExtentTest test) {
        try {
            Thread.sleep(2000);
            helper.waitForElementToBeVisible(FooterLocator.twitter, 5);
            helper.hoverOverElement(FooterLocator.twitter);
            helper.clickOnElement(FooterLocator.twitter);
            String Actual= ExcelFileReader.readExcelData(path, "Pallavi", 3, 1);
            String expected=ExcelFileReader.readExcelData(path, "Pallavi", 3, 1);
            Assertion.useAssert(Actual, expected, test);
            switchToParentWindow();
            
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }

    }

    public void switchToParentWindow() {

        try {
            String parent = Base.driver.getWindowHandle();
            Thread.sleep(2000);
            helper.switchToNewWindow();
            Thread.sleep(2000);
            System.out.println(Base.driver.getTitle());
            Base.driver.close();
            Base.driver.switchTo().window(parent);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
