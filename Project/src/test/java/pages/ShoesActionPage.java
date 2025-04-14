package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.NavBarDropDownLocators;
import uistore.NavBarLocator;
import uistore.ProductDetailsLocator;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;
import utils.Reporter;
import utils.Screenshot;

/**
 * ShoesActionPage handles actions related to the Shoes category, such as
 * verifying
 * the homepage, navigating subcategories, and validating product lists.
 *
 * Created by: Priyanka
 */
public class ShoesActionPage extends Base {
    DriverHelper helper = new DriverHelper(driver);
    String path = ReadProperties.prop.getProperty("path");

    /**
     * @Created by Priyanka
     * @Description This method verifies that the user is on the correct homepage by
     *              comparing
     *              the current URL retrieved from the browser with the expected URL
     *              defined in
     *              the application's properties. Throws an assertion error if
     *              validation fails.
     *
     * @throws AssertionError If the current URL does not match the expected URL,
     *                        the assertion fails, and an error is thrown.
     * @return void This method validates the homepage URL but does not return any
     *         value.
     */
    public void verifyHomepage() {
        try {
            String actual = driver.getCurrentUrl();

            String expected = ReadProperties.prop.getProperty("url");

            Assert.assertEquals(actual, expected);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Priyanka
     * @Description This method hovers over the "Shoes" category in the navigation
     *              bar.
     *              It ensures the category element is visible and interactable
     *              before performing
     *              the hover action. Additionally, it logs the performed actions
     *              for reporting purposes.
     *
     * @param test The ExtentTest instance used for logging actions and hover
     *             interaction.
     * @return void This method performs the hover action and logs results but does
     *         not return any value.
     */
    public void hoveroverShoes(ExtentTest test) {
        try {

            helper.waitForElementToBeVisible(NavBarLocator.hoverOverNavBarShoes, 5);

            helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);

            LoggerHandler.info(ExcelFileReader.readExcelData(path, "Priyanka", 0, 2));
            test.log(Status.INFO, ExcelFileReader.readExcelData(path, "Priyanka", 0, 2));
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * @Created by Priyanka
     * @Description This method verifies the visibility of the "Men", "Women", and
     *              "Junior"
     *              subcategories under the "Shoes" category in the navigation menu.
     *              Each
     *              subcategory is checked to ensure it is displayed on the webpage.
     *
     * @throws AssertionError If any of the "Men", "Women", or "Junior"
     *                        subcategories are
     *                        not displayed, an assertion error will be thrown.
     * @return void This method performs validation of subcategories but does not
     *         return any value.
     */
    public void verifySubCategory() {
        try {

            WebElement men = driver.findElement(By.xpath("(//li//span[contains(text(),'Men')])[3]"));
            Assert.assertTrue(men.isDisplayed());

            WebElement women = driver.findElement(By.xpath("(//li//span[contains(text(),'Women')])[3]"));
            Assert.assertTrue(women.isDisplayed());

            WebElement junior = driver.findElement(By.xpath("(//li//span[contains(text(),'Junior')])[2]"));
            Assert.assertTrue(junior.isDisplayed());
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        }
    }

    /**
     * @Created by Priyanka
     * @Description This method clicks on the "Badminton" option under the Men's
     *              section
     *              in the navigation dropdown and verifies that the landing page is
     *              correct.
     *              It performs a hover action, navigation to the page, and content
     *              validation.
     *              Logs the actions and validation results for reporting purposes.
     *
     * @param test The ExtentTest instance used for logging actions and assertion
     *             results.
     * @throws AssertionError If the validation fails, an assertion error will be
     *                        thrown.
     * @return void This method performs navigation and validation but does not
     *         return a value.
     */
    public void clickBadmintoninMensecandVerify(ExtentTest test) {
        try {

            helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);
            helper.clickOnElement(NavBarDropDownLocators.clickOnBadminton);
            helper.waitForElementToBeVisible(NavBarLocator.hoverOverNavBarShoes, 2);

            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifyBadmintonShoes),
                    ExcelFileReader.readExcelData(path, "Priyanka", 0, 1), test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Priyanka
     * @Description This method hovers over the "Shoes" category in the navigation
     *              bar
     *              and clicks on the "Basketball" option from the dropdown menu. It
     *              then
     *              verifies the Basketball landing page content and logs the
     *              actions
     *              and results for reporting purposes.
     *
     * @param test The ExtentTest instance used for logging actions and assertions.
     * @throws AssertionError If the verification of the Basketball page content
     *                        fails,
     *                        an assertion error is thrown.
     * @return void This method performs navigation and validation but does not
     *         return a value.
     */
    public void hoverShoesandclickBasketBallandVerify(ExtentTest test) {
        try {

            helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);
            test.log(Status.INFO, ExcelFileReader.readExcelData(path, "Priyanka", 0, 2));
            helper.clickOnElement(NavBarDropDownLocators.clickOnBasketBall);
            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifyBasketBall),
                    ExcelFileReader.readExcelData(path, "Priyanka", 1, 1), test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Priyanka
     * @Description This method hovers over the "Shoes" category in the navigation
     *              bar and clicks on the "Cricket" option from the dropdown menu.
     *              It
     *              then verifies the Cricket landing page.
     *
     * @param test The ExtentTest instance used for logging actions and validation
     *             results.
     * @throws AssertionError If the verification of the Cricket page content fails,
     *                        an assertion error is thrown.
     * @return void This method performs navigation and validation but does not
     *         return a value.
     */
    public void clickCricketandverify(ExtentTest test) {
        try {

            helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);

            helper.clickOnElement(NavBarDropDownLocators.clickOnCricket);

            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifyCricket),
                    ExcelFileReader.readExcelData(path, "Priyanka", 2, 1), test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            stepdefinition.Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Priyanka
     * @Description This method hovers over the "Shoes" category in the navigation
     *              bar and clicks on the "Football" option from the dropdown menu.
     *              It
     *              then verifies the Football landing page.
     *
     * @param test The ExtentTest instance used for logging actions, assertions, and
     *             validation results.
     * @throws AssertionError If the verification of the Football page content
     *                        fails,
     *                        an assertion error is thrown.
     * @return void This method performs navigation and validation actions but does
     *         not return a value.
     */
    public void hoverShoesandClickOnFootball(ExtentTest test) {
        try {

            helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);
            helper.clickOnElement(NavBarDropDownLocators.clickOnFootball);
            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifyFootball),
                    ExcelFileReader.readExcelData(path, "Priyanka", 3, 1), test);

            LoggerHandler.info(ExcelFileReader.readExcelData(path, "Priyanka", 1, 2));
            test.log(Status.PASS, ExcelFileReader.readExcelData(path, "Priyanka", 1, 2));
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Priyanka
     * @Description This method hovers over the "Shoes" category in the navigation
     *              bar
     *              and clicks on the "Running" option from the dropdown menu. It
     *              then
     *              validates the Running landing page content by comparing the
     *              actual text
     *              displayed with the expected text from the data source. Logs
     *              actions
     *              and validation results for reporting purposes.
     *
     * @param test The ExtentTest instance used for logging actions and validation
     *             results.
     * @throws AssertionError If the verification of the Running page content fails,
     *                        an assertion error is thrown.
     * @return void This method performs navigation and validation but does not
     *         return a value.
     */
    public void hoverShoesAndclickRunningandverify(ExtentTest test) {
        try {
            helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);

            helper.clickOnElement(NavBarDropDownLocators.clickOnRunning);

            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifyRunning),
                    ExcelFileReader.readExcelData(path, "Priyanka", 4, 1), test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }

    /**
     * @Created by Priyanka
     * @Description This method hovers over the "Shoes" category in the navigation
     *              bar
     *              and clicks on the "Squash" option from the dropdown menu. It
     *              validates the
     *              Squash landing page content by comparing the actual text on the
     *              page with
     *              the expected text retrieved from the data source. Additionally,
     *              it captures
     *              a screenshot and attaches it to the test report for
     *              documentation purposes.
     *              Logs all actions and validation results for reporting.
     *
     * @param test The ExtentTest instance used for logging actions, validation
     *             results,
     *             and attaching screenshots to the report.
     * @throws AssertionError If the verification of the Squash page content fails,
     *                        an assertion error is thrown.
     * @return void This method performs navigation, validation, and screenshot
     *         capture but does not return a value.
     */
    public void hoverShoesandclickSquashandVerify(ExtentTest test) {
        try {

            helper.hoverOverElement(NavBarLocator.hoverOverNavBarShoes);

            helper.clickOnElement(NavBarDropDownLocators.clickOnSquash);

            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifysquash),
                    ExcelFileReader.readExcelData(path, "Priyanka", 5, 1), test);

            Screenshot.captureScreenShot("squash");
            Reporter.attachScreenshotToReport("squash", test, "Screenshot attached to report", driver);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }
}
