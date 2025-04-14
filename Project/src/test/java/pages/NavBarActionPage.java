package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.NavBarDropDownLocators;
import uistore.NavBarLocator;
import uistore.ProductDetailsLocator;
import uistore.ProductsFilterLocator;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;
import utils.Screenshot;

public class NavBarActionPage {

    DriverHelper helper = new DriverHelper(Base.driver);

    public String path = ReadProperties.prop.getProperty("path");

    /**
     * @Created by Lokesh
     * @Description Navigates to the "Batting Gloves" page via the navbar and
     *              verifies the URL and header.
     * @param test ExtentTest instance for logging and verification.
     * @return None
     */
    public void NavBar_Batting_Gloves(ExtentTest test) {
        try {
            helper.waitForElementToBeVisible(NavBarLocator.shopnow, 10);
            helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 6);
            helper.hoverOverElement(NavBarLocator.Team_Sport);
            helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
            helper.hoverOverElement(NavBarDropDownLocators.Batting_Gloves);
            helper.clickOnElement(NavBarDropDownLocators.Batting_Gloves);

            // Verification for batting gloves URL
            String actualURL1 = Base.driver.getCurrentUrl();
            System.out.println(actualURL1);
            String expectedURL1 = ExcelFileReader.readExcelData(path, "Lokesh", 0, 0);
            System.out.println(expectedURL1);
            Assertion.assertionVerifyByContains(actualURL1, expectedURL1, test);

            // Verification for batting gloves page header
            String actualheader1 = Base.driver.getTitle();
            System.out.println(actualheader1);
            String expectedheader1 = ExcelFileReader.readExcelData(path, "Lokesh", 7, 0);
            System.out.println(expectedheader1);
            Assertion.assertionVerifyByContains(actualheader1, expectedheader1, test);

        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Lokesh
     * @Description Navigates to the "Batting Leg Guards" page via the navbar and
     *              verifies the URL and header.
     * @param test ExtentTest instance for logging and verification.
     * @return None
     */
    public void NavBar_Batting_Leg_Guards(ExtentTest test) {
        try {
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 6);
            helper.hoverOverElement(NavBarLocator.Team_Sport);
            helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
            helper.hoverOverElement(NavBarDropDownLocators.Batting_Leg_Guards);
            helper.clickOnElement(NavBarDropDownLocators.Batting_Leg_Guards);
            LoggerHandler.info("Clicked on Batting Leg Guards");

            // Verification for Batting Leg Guards URL
            String actualURL = Base.driver.getCurrentUrl();
            System.out.println(actualURL);
            String expectedURL = ExcelFileReader.readExcelData(path, "Lokesh", 1, 0);
            System.out.println(expectedURL);
            Assertion.assertionVerifyByContains(actualURL, expectedURL, test);

            // Verification for Batting Leg Guards page header
            String actualHeader = Base.driver.getTitle();
            System.out.println(actualHeader);
            String expectedHeader = ExcelFileReader.readExcelData(path, "Lokesh", 8, 0);
            System.out.println(expectedHeader);
            Assertion.assertionVerifyByContains(actualHeader, expectedHeader, test);

        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Lokesh
     * @Description Navigates to the "Wicket Keeping Gloves" page via the navbar and
     *              verifies the URL and header.
     * @param test ExtentTest instance for logging and verification.
     * @return None
     */
    public void NavBar_Wicket_Keeping_Gloves(ExtentTest test) {
        try {
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 2);
            helper.hoverOverElement(NavBarLocator.Team_Sport);
            helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
            helper.hoverOverElement(NavBarDropDownLocators.Wicket_Keeping_Gloves);
            helper.clickOnElement(NavBarDropDownLocators.Wicket_Keeping_Gloves);

            // Verification for Wicket Keeping Gloves URL
            String actualURL = Base.driver.getCurrentUrl();
            System.out.println(actualURL);
            String expectedURL = ExcelFileReader.readExcelData(path, "Lokesh", 2, 0);
            System.out.println(expectedURL);
            Assertion.assertionVerifyByContains(actualURL, expectedURL, test);

            // Verification for Wicket Keeping Gloves page header
            String actualHeader = Base.driver.getTitle();
            System.out.println(actualHeader);
            String expectedHeader = ExcelFileReader.readExcelData(path, "Lokesh", 9, 0);
            System.out.println(expectedHeader);
            Assertion.assertionVerifyByContains(actualHeader, expectedHeader, test);

        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Lokesh
     * @Description Navigates to the "Wicket Keeping Leg Guards" page via the navbar
     *              and verifies the URL and header.
     * @param test ExtentTest instance for logging and verification.
     * @return None
     */
    public void NavBar_Wicket_Keeping_Leg_Guards(ExtentTest test) {
        try {
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 2);
            helper.hoverOverElement(NavBarLocator.Team_Sport);
            helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
            helper.hoverOverElement(NavBarDropDownLocators.Wicket_Keeping_Leg_Guards);
            helper.clickOnElement(NavBarDropDownLocators.Wicket_Keeping_Leg_Guards);

            // Verification for Wicket Keeping Leg Guards URL
            String actualURL = Base.driver.getCurrentUrl();
            System.out.println(actualURL);
            String expectedURL = ExcelFileReader.readExcelData(path, "Lokesh", 3, 0);
            System.out.println(expectedURL);
            Assertion.assertionVerifyByContains(actualURL, expectedURL, test);

            // Verification for Wicket Keeping Leg Guards page header
            String actualHeader = Base.driver.getTitle();
            System.out.println(actualHeader);
            String expectedHeader = ExcelFileReader.readExcelData(path, "Lokesh", 10, 0);
            System.out.println(expectedHeader);
            Assertion.assertionVerifyByContains(actualHeader, expectedHeader, test);

        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Lokesh
     * @Description Navigates to the "Cricket Helmets" page via the navbar and
     *              verifies the URL and header.
     * @param test ExtentTest instance for logging and verification.
     * @return None
     */
    public void NavBar_Cricket_Helmets(ExtentTest test) {
        try {
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(NavBarLocator.shopnow, 6);
            helper.hoverOverElement(NavBarLocator.Team_Sport);
            helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
            helper.hoverOverElement(NavBarDropDownLocators.Circket_Helmets);
            helper.clickOnElement(NavBarDropDownLocators.Circket_Helmets);

            // Verification for Cricket Helmets URL
            String actualURL = Base.driver.getCurrentUrl();
            System.out.println(actualURL);
            String expectedURL = ExcelFileReader.readExcelData(path, "Lokesh", 4, 0);
            System.out.println(expectedURL);
            Assertion.assertionVerifyByContains(actualURL, expectedURL, test);

            // Verification for Cricket Helmets page header
            String actualHeader = Base.driver.getTitle();
            System.out.println(actualHeader);
            String expectedHeader = ExcelFileReader.readExcelData(path, "Lokesh", 11, 0);
            System.out.println(expectedHeader);
            Assertion.assertionVerifyByContains(actualHeader, expectedHeader, test);

        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Lokesh
     * @Description Navigates to the "Inner Thigh Pads" page via the navbar and
     *              verifies the URL and header.
     * @param test ExtentTest instance for logging and verification.
     * @return None
     */
    public void NavBar_Inner_Thigh_Pads(ExtentTest test) {
        try {
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 2);
            helper.hoverOverElement(NavBarLocator.Team_Sport);
            helper.waitForElementToBeVisible(NavBarDropDownLocators.Protective_Gear, 15);
            helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
            helper.waitForElementToBeVisible(NavBarDropDownLocators.Inner_Thigh_Pads, 15);
            helper.hoverOverElement(NavBarDropDownLocators.Inner_Thigh_Pads);
            helper.clickOnElement(NavBarDropDownLocators.Inner_Thigh_Pads);

            // Verification for Inner Thigh Pads URL
            String actualURL = Base.driver.getCurrentUrl();
            System.out.println(actualURL);
            String expectedURL = ExcelFileReader.readExcelData(path, "Lokesh", 5, 0);
            System.out.println(expectedURL);
            Assertion.assertionVerifyByContains(actualURL, expectedURL, test);

            // Verification for Inner Thigh Pads page header
            String actualHeader = Base.driver.getTitle();
            System.out.println(actualHeader);
            String expectedHeader = ExcelFileReader.readExcelData(path, "Lokesh", 12, 0);
            System.out.println(expectedHeader);
            Assertion.assertionVerifyByContains(actualHeader, expectedHeader, test);

            // Capture screenshot
            Screenshot.captureScreenShot("Team_sport");

        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Lokesh
     * @Description Navigates to the "Gym Gloves" page via the navbar and verifies
     *              the product details.
     * @param test ExtentTest instance for logging and verification.
     * @return None
     */
    public void NavBar_Fitness(ExtentTest test) {
        try {
            helper.waitForElementToBeVisible(NavBarLocator.shopnow, 6);
            helper.hoverOverElement(NavBarLocator.Fitness);
            helper.waitForElementToBeVisible(NavBarDropDownLocators.Gym_Gloves, 20);
            helper.hoverOverElement(NavBarDropDownLocators.Gym_Gloves);
            helper.clickOnElement(NavBarDropDownLocators.Gym_Gloves);

            // Verification for Gym Gloves page
            String actualDetails = helper.getText(ProductDetailsLocator.Gym_Accessories);
            System.out.println(actualDetails);
            String expectedDetails = ExcelFileReader.readExcelData(path, "Lokesh", 14, 0);
            System.out.println(expectedDetails);
            Assertion.assertionVerifyByContains(actualDetails, expectedDetails, test);

        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Lokesh
     * @Description Navigates to the "Everlast Gym Gloves" product page via filters
     *              and verifies the title.
     * @param test ExtentTest instance for logging and verification.
     * @return None
     */
    public void Gym_Gloves(ExtentTest test) {
        try {
            helper.hoverOverElement(ProductsFilterLocator.Brand_EverLast);
            helper.clickOnElement(ProductsFilterLocator.Brand_EverLast);
            helper.hoverOverElement(ProductDetailsLocator.Everlast_mens_Gloves);
            helper.clickOnElement(ProductDetailsLocator.Everlast_mens_Gloves);

            // Verification for Everlast title
            String actualTitle = Base.driver.getTitle();
            System.out.println(actualTitle);
            String expectedTitle = ExcelFileReader.readExcelData(path, "Lokesh", 16, 0);
            System.out.println(expectedTitle);
            Assertion.assertionVerifyByContains(actualTitle, expectedTitle, test);

        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Lokesh
     * @Description Adds a product to the cart and navigates to the cart view.
     * @param test ExtentTest instance for logging and verification.
     * @return None
     */
    public void add_to_cart(ExtentTest test) {
        try {
            helper.hoverOverElement(ProductDetailsLocator.Add_to_cart);
            helper.clickOnElement(ProductDetailsLocator.Add_to_cart);
            helper.waitForElementToBeVisible(NavBarLocator.Cart, 2);
            helper.hoverOverElement(NavBarLocator.Cart);
            helper.hoverOverElement(NavBarDropDownLocators.view_cart);
            helper.clickOnElement(NavBarDropDownLocators.view_cart);

        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Lokesh
     * @Description Initiates the checkout process by clicking on the "Proceed to
     *              Checkout" option and captures a screenshot.
     * @param test ExtentTest instance for logging and verification.
     * @return None
     */
    public void checkout(ExtentTest test) {
        try {
            helper.waitForElementToBeVisible(NavBarDropDownLocators.Proceed_to_checkout, 1);
            helper.hoverOverElement(NavBarDropDownLocators.Proceed_to_checkout);

            // Capture screenshot before proceeding
            Screenshot.captureScreenShot("Fitness_Gloves");

            helper.waitForElementToBeVisible(NavBarDropDownLocators.Proceed_to_checkout, 1);
            helper.clickOnElement(NavBarDropDownLocators.Proceed_to_checkout);

        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

}
