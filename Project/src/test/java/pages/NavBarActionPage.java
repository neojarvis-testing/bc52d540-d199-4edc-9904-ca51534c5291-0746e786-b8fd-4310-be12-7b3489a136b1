package pages;

import com.aventstack.extentreports.ExtentTest;
import uistore.NavBarDropDownLocators;
import uistore.NavBarLocator;
import uistore.ProductDetailsLocator;
import uistore.ProductsFilterLocator;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.ReadProperties;
import utils.Screenshot;

public class NavBarActionPage {

    DriverHelper helper = new DriverHelper(Base.driver);

    public String path = ReadProperties.prop.getProperty("path");

    public void NavBar_Batting_Gloves(ExtentTest test) {

        helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 2);
        helper.hoverOverElement(NavBarLocator.Team_Sport);
        helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
        helper.hoverOverElement(NavBarDropDownLocators.Batting_Gloves);
        helper.clickOnElement(NavBarDropDownLocators.Batting_Gloves);
        // verification for batting gloves URL
        String actualURL1 = Base.driver.getCurrentUrl();
        System.out.println(actualURL1);
        String expectedURL1 = ExcelFileReader.readExcelData(path, "Lokesh", 0, 0);
        System.out.println(expectedURL1);
        Assertion.assertionVerifyByContains(actualURL1, expectedURL1, test);
        // verification for batting gloves page header
        String actualheader1 = Base.driver.getTitle();
        System.out.println(actualheader1);
        String expectedheader1 = ExcelFileReader.readExcelData(path, "Lokesh", 7, 0);
        System.out.println(expectedheader1);
        Assertion.assertionVerifyByContains(actualheader1, expectedheader1, test);

    }

    public void NavBar_Batting_Leg_Guards(ExtentTest test) {

        Base.driver.navigate().back();
        helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 2);
        helper.hoverOverElement(NavBarLocator.Team_Sport);
        helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
        helper.hoverOverElement(NavBarDropDownLocators.Batting_Leg_Guards);
        helper.clickOnElement(NavBarDropDownLocators.Batting_Leg_Guards);
        // verification for batting leg guards URL
        String actualURL2 = Base.driver.getCurrentUrl();
        System.out.println(actualURL2);
        String expectedURL2 = ExcelFileReader.readExcelData(path, "Lokesh", 1, 0);
        System.out.println(expectedURL2);
        Assertion.assertionVerifyByContains(actualURL2, expectedURL2, test);
        // verification for batting leg guards header
        String actualheader2 = Base.driver.getTitle();
        System.out.println(actualheader2);
        String expectedheader2 = ExcelFileReader.readExcelData(path, "Lokesh", 8, 0);
        System.out.println(expectedheader2);
        Assertion.assertionVerifyByContains(actualheader2, expectedheader2, test);

    }

    public void NavBar_Wicket_Keeping_Gloves(ExtentTest test) {

        Base.driver.navigate().back();
        helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 2);
        helper.hoverOverElement(NavBarLocator.Team_Sport);
        helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
        helper.hoverOverElement(NavBarDropDownLocators.Wicket_Keeping_Gloves);
        helper.clickOnElement(NavBarDropDownLocators.Wicket_Keeping_Gloves);
        // verification for wicket keeping gloves URL
        String actualURL3 = Base.driver.getCurrentUrl();
        System.out.println(actualURL3);
        String expectedURL3 = ExcelFileReader.readExcelData(path, "Lokesh", 2, 0);
        System.out.println(expectedURL3);
        Assertion.assertionVerifyByContains(actualURL3, expectedURL3, test);
        // verification for wicket keeping gloves header
        String actualheader3 = Base.driver.getTitle();
        System.out.println(actualheader3);
        String expectedheader3 = ExcelFileReader.readExcelData(path, "Lokesh", 9, 0);
        System.out.println(expectedheader3);
        Assertion.assertionVerifyByContains(actualheader3, expectedheader3, test);

    }

    public void NavBar_Wicket_Keeping_Leg_Guards(ExtentTest test) {

        Base.driver.navigate().back();
        helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 2);
        helper.hoverOverElement(NavBarLocator.Team_Sport);
        helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
        helper.hoverOverElement(NavBarDropDownLocators.Wicket_Keeping_Leg_Guards);
        helper.clickOnElement(NavBarDropDownLocators.Wicket_Keeping_Leg_Guards);
        // verification for wicket keeping leg guards URL
        String actualURL4 = Base.driver.getCurrentUrl();
        System.out.println(actualURL4);
        String expectedURL4 = ExcelFileReader.readExcelData(path, "Lokesh", 3, 0);
        System.out.println(expectedURL4);
        Assertion.assertionVerifyByContains(actualURL4, expectedURL4, test);
        // verification for wicket keeping leg guards header
        String actualheader4 = Base.driver.getTitle();
        System.out.println(actualheader4);
        String expectedheader4 = ExcelFileReader.readExcelData(path, "Lokesh", 10, 0);
        System.out.println(expectedheader4);
        Assertion.assertionVerifyByContains(actualheader4, expectedheader4, test);

    }

    public void NavBar_Circket_Helmets(ExtentTest test) {

        Base.driver.navigate().back();
        helper.waitForElementToBeVisible(NavBarLocator.shopnow, 20);
        helper.hoverOverElement(NavBarLocator.Team_Sport);
        helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
        helper.hoverOverElement(NavBarDropDownLocators.Circket_Helmets);
        helper.clickOnElement(NavBarDropDownLocators.Circket_Helmets);
        // verification for circket helmets URL
        String actualURL5 = Base.driver.getCurrentUrl();
        System.out.println(actualURL5);
        String expectedURL5 = ExcelFileReader.readExcelData(path, "Lokesh", 4, 0);
        System.out.println(expectedURL5);
        Assertion.assertionVerifyByContains(actualURL5, expectedURL5, test);
        // verification for wicket keeping gloves header
        String actualheader5 = Base.driver.getTitle();
        System.out.println(actualheader5);
        String expectedheader5 = ExcelFileReader.readExcelData(path, "Lokesh", 11, 0);
        System.out.println(expectedheader5);
        Assertion.assertionVerifyByContains(actualheader5, expectedheader5, test);
    }

    public void NavBar_Inner_Thigh_Pads(ExtentTest test) {

        Base.driver.navigate().back();
        helper.waitForElementToBeVisible(NavBarLocator.Team_Sport, 2);
        helper.hoverOverElement(NavBarLocator.Team_Sport);
        helper.waitForElementToBeVisible(NavBarDropDownLocators.Protective_Gear, 15);
        helper.hoverOverElement(NavBarDropDownLocators.Protective_Gear);
        helper.waitForElementToBeVisible(NavBarDropDownLocators.Inner_Thigh_Pads, 15);
        helper.hoverOverElement(NavBarDropDownLocators.Inner_Thigh_Pads);
        // helper.waitForElementToBeVisible(NavBarDropDownLocators_Lokesh.Inner_Thigh_Pads,
        // 15);
        helper.clickOnElement(NavBarDropDownLocators.Inner_Thigh_Pads);
        // verification for inner thigh pads URL
        String actualURL6 = Base.driver.getCurrentUrl();
        System.out.println(actualURL6);
        String expectedURL6 = ExcelFileReader.readExcelData(path, "Lokesh", 5, 0);
        System.out.println(expectedURL6);
        Assertion.assertionVerifyByContains(actualURL6, expectedURL6, test);
        // verification for inner thigh pads header
        String actualheader6 = Base.driver.getTitle();
        System.out.println(actualheader6);
        String expectedheader6 = ExcelFileReader.readExcelData(path, "Lokesh", 12, 0);
        System.out.println(expectedheader6);
        Assertion.assertionVerifyByContains(actualheader6, expectedheader6, test);
        Screenshot.captureScreenShot("Team_sport");
    }

    public void NavBar_Fitness(ExtentTest test) {

        // helper.waitForElementToBeVisible(NavBarLocator.Fitness, 1);
        helper.waitForElementToBeVisible(NavBarLocator.shopnow, 20);
        helper.hoverOverElement(NavBarLocator.Fitness);
        helper.waitForElementToBeVisible(NavBarDropDownLocators.Gym_Gloves, 20);
        helper.hoverOverElement(NavBarDropDownLocators.Gym_Gloves);
        helper.clickOnElement(NavBarDropDownLocators.Gym_Gloves);
        // verification for Gym Gloves page
        String actual1 = helper.getText(ProductDetailsLocator.Gym_Accessories);
        String expected1 = ExcelFileReader.readExcelData(path, "Lokesh", 14, 0);
        Assertion.assertionVerifyByContains(actual1, expected1, test);
    }

    public void Gym_Gloves(ExtentTest test) {
        helper.hoverOverElement(ProductsFilterLocator.Brand_EverLast);
        helper.clickOnElement(ProductsFilterLocator.Brand_EverLast);
        helper.hoverOverElement(ProductDetailsLocator.Everlast_mens_Gloves);
        helper.clickOnElement(ProductDetailsLocator.Everlast_mens_Gloves);
        // verification for Everlast title
        String actual3 = Base.driver.getTitle();
        System.out.println(actual3);
        String expected3 = ExcelFileReader.readExcelData(path, "Lokesh", 16, 0);
        System.out.println(expected3);
        Assertion.assertionVerifyByContains(actual3, expected3, test);

    }

    public void add_to_cart(ExtentTest test) {

        helper.hoverOverElement(ProductDetailsLocator.Add_to_cart);
        helper.clickOnElement(ProductDetailsLocator.Add_to_cart);
        helper.waitForElementToBeVisible(NavBarLocator.Cart, 2);
        helper.hoverOverElement(NavBarLocator.Cart);
        helper.hoverOverElement(NavBarDropDownLocators.view_cart);
        helper.clickOnElement(NavBarDropDownLocators.view_cart);

    }

    public void checkout(ExtentTest test) {

        helper.waitForElementToBeVisible(NavBarDropDownLocators.Proceed_to_checkout, 1);
        helper.hoverOverElement(NavBarDropDownLocators.Proceed_to_checkout);
        Screenshot.captureScreenShot("Fitness_Gloves");
        helper.waitForElementToBeVisible(NavBarDropDownLocators.Proceed_to_checkout, 1);
        helper.clickOnElement(NavBarDropDownLocators.Proceed_to_checkout);
        // helper.waitForElementToBeVisible(NavBarDropDownLocators.Proceed_to_checkout,
        // 1);
    }

}
