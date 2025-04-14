package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

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
                        e.printStackTrace();
                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

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
                        e.printStackTrace();
                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

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
                        e.printStackTrace();
                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

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
                        e.printStackTrace();
                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

        public void selectRunning(ExtentTest test) {
                try {

                        helper.waitForElementToBeVisible(NavBarLocator.running, 5);
                        helper.hoverOverElement(NavBarLocator.running);
                        helper.clickOnElement(NavBarLocator.running);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        10, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        10, 1));
                        helper.waitForElementToBeVisible(NavBarLocator.clearAll, 4);
                        helper.hoverOverElement(NavBarLocator.clearAll);
                        helper.clickOnElement(NavBarLocator.clearAll);
                        LoggerHandler.info(
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        11, 1));
                        test.log(Status.INFO,
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        11, 1));
                        String actual4 = Base.driver.findElement(NavBarLocator.Text1).getText();
                        String expected4 = ExcelFileReader.readExcelData(path,
                                        "Harshit", 2, 0);
                        Assertion.useAssert(actual4, expected4, test);
                        test.log(Status.PASS,
                                        ExcelFileReader.readExcelData(path, "Harshit",
                                                        12, 1));

                } catch (Exception e) {
                        e.printStackTrace();

                } catch (AssertionError e) {
                        e.printStackTrace();

                }

        }

}
