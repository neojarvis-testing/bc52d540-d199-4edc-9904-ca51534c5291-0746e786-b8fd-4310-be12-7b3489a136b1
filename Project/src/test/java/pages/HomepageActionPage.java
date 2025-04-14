package pages;

import java.util.Random;

import com.aventstack.extentreports.ExtentTest;

import uistore.LoginModuleLocator;
import uistore.NavBarDropDownLocators;
import uistore.NavBarLocator;
import uistore.ProductDetailsLocator;
import uistore.ProductsFilterLocator;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.ReadProperties;

public class HomepageActionPage {

  public String path = ReadProperties.prop.getProperty("path");
  DriverHelper helper = new DriverHelper(Base.driver);
  String currUrl = Base.driver.getCurrentUrl();

  public void rackethoverclick(ExtentTest test) {
    try {
      System.out.println("Hello1");
      // helper.waitForElementToBeVisible(NavBarLocator.Racket_sports, 20);
      helper.waitForElementToBeVisible(NavBarLocator.shopnow, 20);
      helper.hoverOverElement(NavBarLocator.Racket_sports);
      helper.waitForElementToBeVisible(NavBarDropDownLocators.Badminton_Rackets, 20);
      helper.clickOnElement(NavBarDropDownLocators.Badminton_Rackets);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void clickingfirstProduct(ExtentTest test) {
    try {
      System.out.println("Hello2");
      helper.waitForElementToBeVisible(ProductDetailsLocator.Rackets_firstproduct, 10);
      helper.clickOnElement(ProductDetailsLocator.Rackets_firstproduct);
      helper.clickOnElement(ProductsFilterLocator.plusincrease_racketsports);
      helper.clickOnElement(ProductsFilterLocator.Addtocart_racketsports);
      helper.clickOnElement(ProductsFilterLocator.input_zipcode);
      helper.sendKeys(ProductsFilterLocator.input_zipcode, "641001");
      helper.clickOnElement(ProductsFilterLocator.check_Button);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public void navigateBackHome(ExtentTest test) {
    try {
      System.out.println("Hello3");
      Base.driver.navigate().to(currUrl);
      // helper.waitForElementToBeVisible(NavBarLocator.Racket_sports, 10);
      helper.waitForElementToBeVisible(NavBarLocator.shopnow, 20);
      helper.hoverOverElement(NavBarLocator.Racket_sports);
      helper.waitForElementToBeVisible(NavBarDropDownLocators.Badminton_Rackets, 20);
      helper.clickOnElement(NavBarDropDownLocators.Badminton_shoes);
      helper.waitForElementToBeVisible(NavBarDropDownLocators.Badminton_Rackets, 20);
      helper.clickOnElement(ProductDetailsLocator.shoes_firstproduct);
      helper.clickOnElement(ProductsFilterLocator.size_selects);
      helper.clickOnElement(ProductsFilterLocator.Addtocart_badmintonshoes);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void hoversportsandsports(ExtentTest test) {
    try {
      helper.hoverOverElement(NavBarLocator.Racket_sports);
      helper.waitForElementToBeVisible(NavBarDropDownLocators.shop_sportswear, 5);
      helper.clickOnElement(NavBarDropDownLocators.shop_sportswear);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public void listingviewcompare(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(ProductDetailsLocator.list_viewproduct, 10);
      helper.hoverOverElement(ProductDetailsLocator.list_viewproduct);
      helper.clickOnElement(ProductDetailsLocator.list_viewproduct);
      helper.waitForElementToBeVisible(ProductsFilterLocator.compare1_product, 10);
      helper.clickOnElement(ProductsFilterLocator.compare1_product);
      helper.waitForElementToBeVisible(ProductsFilterLocator.compare2_product, 10);
      helper.clickOnElement(ProductsFilterLocator.compare2_product);
      helper.waitForElementToBeVisible(ProductsFilterLocator.compareproduct, 10);
      helper.clickOnElement(ProductsFilterLocator.compareproduct);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public void removingProducts(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(ProductsFilterLocator.firstProductwrong, 5);
      helper.waitForElementToBeVisible(ProductsFilterLocator.secondProductwrong, 5);
      helper.clickOnElement(ProductsFilterLocator.secondProductwrong);
      helper.waitForElementToBeVisible(ProductsFilterLocator.OKClick, 10);
      helper.clickOnElement(ProductsFilterLocator.OKClick);
      helper.clickOnElement(ProductsFilterLocator.firstProductwrong);
      helper.waitForElementToBeVisible(ProductsFilterLocator.OKClick, 10);
      helper.clickOnElement(ProductsFilterLocator.OKClick);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void navigateToLoginPage(ExtentTest test) {

    helper.waitForElementToBeVisible(NavBarLocator.userIcon, 10);
    String expected = ExcelFileReader.readExcelData(path, "Mohit", 6, 0);

    helper.waitForElementToBeVisible(NavBarLocator.shopnow, 15);
    Assertion.useAssert(helper.getText(NavBarLocator.shopnow), expected, test);

    helper.hoverOverElement(NavBarLocator.userIcon);

    helper.waitForElementToBeVisible(NavBarDropDownLocators.login, 10);
    helper.clickOnElement(NavBarDropDownLocators.login);

    helper.waitForElementToBeVisible(LoginModuleLocator.createAccount, 15);
    String verifyLogin = ExcelFileReader.readExcelData(path, "Mohit", 7, 0);
    Assertion.assertionVerifyByContains(helper.getText(LoginModuleLocator.createAccount), verifyLogin, test);
  }

  public void navigateToCreateAccountPage(ExtentTest test) {
    helper.waitForElementToBeVisible(LoginModuleLocator.createAccount, 10);
    helper.clickOnElement(LoginModuleLocator.createAccount);
    helper.waitForElementToBeVisible(LoginModuleLocator.firstName, 10);
  }

  public void createAccount(ExtentTest test) {

    String firstname = ExcelFileReader
        .readExcelData(path, "Mohit", 0, 0);
    String lastname = ExcelFileReader.readExcelData(path,
        "Mohit", 1, 0);
    String email = generateRandomEmail(); // Generate random email
    String password = ExcelFileReader.readExcelData(path,
        "Mohit", 3, 0);

    // helper.clickOnElement(LoginModuleLocator.firstName);
    helper.sendKeys(LoginModuleLocator.firstName, firstname);

    // helper.clickOnElement(LoginModuleLocator.lastName);
    helper.sendKeys(LoginModuleLocator.lastName, lastname);

    // helper.clickOnElement(LoginModuleLocator.email);
    helper.sendKeys(LoginModuleLocator.email, email);

    // helper.clickOnElement(LoginModuleLocator.password);
    helper.sendKeys(LoginModuleLocator.password, password);

    // helper.clickOnElement(LoginModuleLocator.confirmPassword);
    helper.sendKeys(LoginModuleLocator.confirmPassword, password);

    helper.clickOnElement(LoginModuleLocator.confirmCreateButton);

    helper.waitForElementToBeVisible(LoginModuleLocator.thankYouMessage, 15);

    String expectedThankYou = ExcelFileReader.readExcelData(path, "Mohit", 8, 0);
    System.out.println(expectedThankYou);

    Assertion.useAssert(helper.getText(LoginModuleLocator.thankYouMessage), expectedThankYou, test);

  }

  public void logout(ExtentTest test) {
    helper.clickOnElement(LoginModuleLocator.logout);

    helper.waitForElementToBeVisible(LoginModuleLocator.verify5secWait, 15);

    String expected5secText = ExcelFileReader.readExcelData(path, "Mohit", 9, 0);
    System.out.println(expected5secText);
    System.out.println("==" + helper.getText(LoginModuleLocator.verify5secWait) + "====");
    Assertion.useAssert(helper.getText(LoginModuleLocator.verify5secWait), expected5secText, test);

    helper.waitForElementToBeVisible(NavBarLocator.shopnow, 15);
  }

  public void loginWithExistingUser(ExtentTest test) {
    String userEmail = ExcelFileReader
        .readExcelData(path, "Mohit", 4, 0);
    String userPassword = ExcelFileReader
        .readExcelData(path, "Mohit", 5, 0);

    helper.hoverOverElement(NavBarLocator.userIcon);
    helper.clickOnElement(NavBarDropDownLocators.login);

    // helper.clickOnElement(LoginModuleLocator.emailLogin);
    helper.sendKeys(LoginModuleLocator.emailLogin, userEmail);

    // helper.clickOnElement(LoginModuleLocator.passwordLogin);
    helper.sendKeys(LoginModuleLocator.passwordLogin, userPassword);

    helper.clickOnElement(LoginModuleLocator.signIn);

    helper.waitForElementToBeVisible(LoginModuleLocator.verifyErrorMessage, 15);

    String expectedVerifyError = ExcelFileReader.readExcelData(path, "Mohit", 10, 0);
    System.out.println(expectedVerifyError);
    Assertion.useAssert(helper.getText(LoginModuleLocator.verifyErrorMessage), expectedVerifyError, test);
  }

  public String generateRandomEmail() {
    String prefix = "mohit";
    String suffix = "@gmail.com";
    int randomNumber = new Random().nextInt(10000);
    return prefix + randomNumber + suffix;
  }
}
