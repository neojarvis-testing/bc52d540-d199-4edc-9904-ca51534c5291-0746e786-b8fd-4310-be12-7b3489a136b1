package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.NavBarLocator;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;

public class RacketActionPage {
        DriverHelper helper = new DriverHelper(Base.driver);
        String path = ReadProperties.prop.getProperty("path");

        /**
         * Created by Harshit Gupta
         *
         * Selects a racket through the search bar and verifies the selection.
         *
         * @param test ExtentTest instance for logging steps and validation.
         * @return None
         */
        public void selectRacket(ExtentTest test) {
                try {

                        helper.waitForElementToBeVisible(NavBarLocator.searchBar, 2);
                        helper.clickOnElement(NavBarLocator.searchBar);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        0, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        0, 1));
                        helper.waitForElementToBeVisible(NavBarLocator.search, 2);
                        helper.clickOnElement(NavBarLocator.search);
                        String adidas = ExcelFileReader.readExcelData(path,
                                        "Harshit", 0, 0);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        1, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        1, 1));
                        helper.sendKeys(NavBarLocator.search, adidas);
                        helper.hoverOverElement(NavBarLocator.GoButton);
                        helper.clickOnElement(NavBarLocator.GoButton);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        2, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        2, 1));
                        helper.enterAction(NavBarLocator.search);
                        String actual = Base.driver.getCurrentUrl();
                        String expected = ExcelFileReader.readExcelData(path,
                                        "Harshit", 1, 0);
                        Assertion.useAssert(actual, expected, test);

                } catch (Exception e) {
                        LoggerHandler.info(e.getMessage());
                        Hooks.test.log(Status.INFO, e.getMessage());
                } catch (AssertionError e) {
                        LoggerHandler.info(e.getMessage());
                        Hooks.test.log(Status.INFO, e.getMessage());

                }

        }

        /**
         * Created by Harshit Gupta
         *
         * Applies filters on racket sports and removes the racket selection.
         *
         * @param test ExtentTest instance for logging steps and validation.
         * @return None
         */
        public void applyFilter(ExtentTest test) {
                try {
                        helper.hoverOverElement(NavBarLocator.RocketSports);
                        helper.clickOnElement(NavBarLocator.RocketSports);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        4, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        4, 1));
                        helper.waitForElementToBeVisible(NavBarLocator.shoes, 3);
                        helper.hoverOverElement(NavBarLocator.shoes);
                        helper.clickOnElement(NavBarLocator.shoes);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        5, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        5, 1));
                        String actual2 = Base.driver.findElement(NavBarLocator.Text1).getText();
                        String expected2 = ExcelFileReader.readExcelData(path,
                                        "Harshit", 2, 0);
                        Assertion.useAssert(actual2, expected2, test);
                        helper.hoverOverElement(NavBarLocator.removeRacket);
                        helper.clickOnElement(NavBarLocator.removeRacket);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        7, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        7, 1));

                        String actual3 = Base.driver.findElement(NavBarLocator.Text2).getText();

                        String expected3 = ExcelFileReader.readExcelData(
                                        path,
                                        "Harshit", 3, 0);
                        Assertion.useAssert(actual3, expected3, test);

                } catch (Exception e) {
                        LoggerHandler.error(e.getMessage());
                        Hooks.test.log(Status.FAIL, e.getMessage());
                } catch (AssertionError e) {
                        LoggerHandler.info(e.getMessage());
                        Hooks.test.log(Status.INFO, e.getMessage());
                }

        }

        /**
         * Created by Harshit Gupta
         *
         * Selects the Clothing category from the navigation bar.
         *
         * @param test ExtentTest instance for logging steps and validation.
         * @return None
         */

        public void selectClothing(ExtentTest test) {
                try {
                        helper.waitForElementToBeVisible(NavBarLocator.clothing, 3);
                        helper.hoverOverElement(NavBarLocator.clothing);
                        helper.clickOnElement(NavBarLocator.clothing);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        8, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        8, 1));
                } catch (Exception e) {
                        LoggerHandler.info(e.getMessage());
                        Hooks.test.log(Status.INFO, e.getMessage());
                } catch (AssertionError e) {
                        LoggerHandler.info(e.getMessage());
                        Hooks.test.log(Status.INFO, e.getMessage());

                }

        }

        /**
         * Created by Harshit Gupta
         *
         * Selects the Accessories category from the navigation bar.
         *
         * @param test ExtentTest instance for logging steps and validation.
         * @return None
         */

        public void selectAccessories(ExtentTest test) {
                try {
                        helper.waitForElementToBeVisible(NavBarLocator.accessories, 3);
                        helper.hoverOverElement(NavBarLocator.accessories);
                        helper.clickOnElement(NavBarLocator.accessories);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        9, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        9, 1));
                } catch (Exception e) {
                        LoggerHandler.info(e.getMessage());
                        Hooks.test.log(Status.INFO, e.getMessage());
                } catch (AssertionError e) {
                        LoggerHandler.info(e.getMessage());
                        Hooks.test.log(Status.INFO, e.getMessage());

                }

        }

        /**
         * Created by Harshit Gupta
         *
         * Selects the Running category and clears all applied filters.
         *
         * @param test ExtentTest instance for logging steps and validation.
         * @return None
         */
        public void selectRunning(ExtentTest test) {
                try {
                        helper.waitForElementToBeVisible(NavBarLocator.running, 5);
                        helper.hoverOverElement(NavBarLocator.running);
                        helper.clickOnElement(NavBarLocator.running);
                        LoggerHandler.info(ExcelFileReader.readExcelData(path, "Harshit", 10, 1));
                        test.log(Status.INFO, ExcelFileReader.readExcelData(path, "Harshit", 10, 1));

                        helper.waitForElementToBeVisible(NavBarLocator.clearAll, 4);
                        helper.hoverOverElement(NavBarLocator.clearAll);
                        helper.clickOnElement(NavBarLocator.clearAll);
                        LoggerHandler.info(ExcelFileReader.readExcelData(path, "Harshit", 11, 1));
                        test.log(Status.INFO, ExcelFileReader.readExcelData(path, "Harshit", 11, 1));

                } catch (Exception e) {
                        LoggerHandler.info(e.getMessage());
                        Hooks.test.log(Status.INFO, e.getMessage());
                }
        }

        /**
         * Created by Harshit Gupta
         *
         * Verifies the Running category selection by asserting the expected text.
         *
         * @param test ExtentTest instance for logging steps and validation.
         * @return None
         */
        public void verifyRunningSelection(ExtentTest test) {
                try {
                        String actualText = Base.driver.findElement(NavBarLocator.Text1).getText();
                        String expectedText = ExcelFileReader.readExcelData(path, "Harshit", 2, 0);
                        Assertion.useAssert(actualText, expectedText, test);
                        test.log(Status.PASS, ExcelFileReader.readExcelData(path, "Harshit", 12, 1));

                } catch (Exception e) {
                        LoggerHandler.info(e.getMessage());
                        Hooks.test.log(Status.INFO, e.getMessage());

                } catch (AssertionError e) {
                        LoggerHandler.info(e.getMessage());
                        Hooks.test.log(Status.INFO, e.getMessage());

                }

        }

}
