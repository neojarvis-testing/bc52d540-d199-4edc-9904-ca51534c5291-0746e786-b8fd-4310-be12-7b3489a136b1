package pages;

import java.util.Random;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.LoginModuleLocator;
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

public class HomepageActionPage {

  public String path = ReadProperties.prop.getProperty("path");
  DriverHelper helper = new DriverHelper(Base.driver);
  String currUrl = Base.driver.getCurrentUrl();

  /**
   * @Created by Uday
   * @Description Waits for 'Shop Now' visibility, hovers over 'Racket Sports',
   *              and clicks 'Badminton Rackets'.
   * @param ExtentTest instance for logging and verification.
   * @return None
   */
  public void rackethoverclick(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(NavBarLocator.shopnow, 20);
      helper.hoverOverElement(NavBarLocator.Racket_sports);
      helper.clickOnElement(NavBarDropDownLocators.Badminton_Rackets);
      String actual = Base.driver.getTitle();
      String curr = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 0, 0);
      Assertion.useAssert(actual, curr, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.INFO, e.getMessage());
    }
  }

  /**
   * @Created by Uday
   * @Description Waits for the first racket product to be visible and clicks on
   *              it.
   * @param ExtentTest instance for logging and verification.
   * @return None
   */

  public void clickingfirstProduct(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(ProductDetailsLocator.Rackets_firstproduct, 3);
      helper.clickOnElement(ProductDetailsLocator.Rackets_firstproduct);
      String actual1 = Base.driver.getTitle();
      String curr1 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 2, 0);
      Assertion.useAssert(actual1, curr1, test);

      String actual2 = Base.driver.findElement(ProductDetailsLocator.verifyaddtocartButton).getText();
      String curr2 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 1, 0);
      Assertion.useAssert(actual2, curr2, test);

    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.INFO, e.getMessage());
    }
  }

  /**
   * @Created by Uday
   * @Description Increases the quantity of a racket product and adds it to the
   *              cart.
   * @param ExtentTest instance for logging and verification.
   * @return None
   */

  public void increasingquantingplus(ExtentTest test) {
    try {
      helper.clickOnElement(ProductsFilterLocator.plusincrease_racketsports);
      helper.clickOnElement(ProductsFilterLocator.Addtocart_racketsports);
      String actual3 = Base.driver.findElement(ProductDetailsLocator.verifyafterclickingaddtocart).getText();
      String curr3 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 3, 0);
      Assertion.useAssert(actual3, curr3, test);

    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.INFO, e.getMessage());
    }
  }

  /**
   * @Created by Uday
   * @Description Inputs the required ZIP code and verifies it.
   * @param ExtentTest instance for logging and verification and string ZIP code
   *                   to be entered.
   * @return None
   */

  public void enteringthezipcoderequired(ExtentTest test, String string) {
    try {
      helper.clickOnElement(ProductsFilterLocator.input_zipcode);
      helper.sendKeys(ProductsFilterLocator.input_zipcode, string);
      helper.clickOnElement(ProductsFilterLocator.check_Button);
      String actual4 = Base.driver.findElement(ProductDetailsLocator.verifycheckafterclicking).getText();
      String curr4 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 4, 0);
      Assertion.useAssert(actual4, curr4, test);

    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.INFO, e.getMessage());
    }
  }

  public void navigateBackHomeUrl(ExtentTest test) {
    try {
      Base.driver.navigate().to(currUrl);
      helper.waitForElementToBeVisible(NavBarLocator.shopnow, 20);
      helper.hoverOverElement(NavBarLocator.Racket_sports);
      helper.waitForElementToBeVisible(NavBarDropDownLocators.Badminton_Rackets, 20);
      helper.clickOnElement(NavBarDropDownLocators.Badminton_shoes);
      String actual6 = Base.driver.getTitle();
      String curr6 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 6, 0);
      Assertion.useAssert(actual6, curr6, test);

    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.INFO, e.getMessage());
    }
  }

  /**
   * @Created by Uday
   * @Description Selects the first shoe product and chooses a size.
   * @param ExtentTest instance for logging and verification.
   * @return None
   */

  public void clicksshoeproductadd(ExtentTest test) {
    try {
      helper.clickOnElement(ProductDetailsLocator.shoes_firstproduct);
      helper.clickOnElement(ProductsFilterLocator.size_selects);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.INFO, e.getMessage());
    }
  }

  /**
   * @Created by Uday
   * @Description Adds badminton shoes to the cart and captures a screenshot.
   * @param ExtentTest instance for logging and verification.
   * @return None
   */

  public void screenshotofthecart(ExtentTest test) {
    try {
      helper.clickOnElement(ProductsFilterLocator.Addtocart_badmintonshoes);
      String namescreen = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 5, 0);
      Screenshot.captureScreenShot(namescreen);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.INFO, e.getMessage());
    }
  }

  // testcase3
  /**
   * @Created by Uday
   * @Description Hovers over 'Racket Sports' and clicks on 'Shop Sportswear'.
   * @param ExtentTest instance for logging and verification.
   * @return None
   */

  public void hoversportsandsports(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(NavBarLocator.shopnow, 20);
      helper.hoverOverElement(NavBarLocator.Racket_sports);
      helper.waitForElementToBeVisible(NavBarDropDownLocators.shop_sportswear, 5);
      helper.clickOnElement(NavBarDropDownLocators.shop_sportswear);
      String actual7 = Base.driver.getCurrentUrl();
      String curr7 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 0, 1);
      Assertion.assertionVerifyByContains(actual7, curr7, test);

      String actual8 = Base.driver.findElement(ProductDetailsLocator.verifyclothingheading).getText();
      String curr8 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 1, 1);
      Assertion.useAssert(actual8, curr8, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.INFO, e.getMessage());
    }
  }

  /**
   * @Created by Uday
   * @Description Waits for the list view product to be visible, hovers over it,
   *              and clicks on it.
   * @param None
   * @return None
   */

  public void listingviewcompare(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(ProductDetailsLocator.list_viewproduct, 10);
      helper.hoverOverElement(ProductDetailsLocator.list_viewproduct);
      helper.clickOnElement(ProductDetailsLocator.list_viewproduct);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.INFO, e.getMessage());
    }
  }

  /**
   * @Created by Uday
   * @Description Waits for two products to be visible and selects them for
   *              comparison.
   * @param None
   * @return None
   */

  public void twoproductsComparing(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(ProductsFilterLocator.compare1_product, 10);
      helper.clickOnElement(ProductsFilterLocator.compare1_product);
      String actual9 = Base.driver.findElement(ProductDetailsLocator.verifycompare1product).getText();
      String curr9 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 6, 1);
      Assertion.useAssert(actual9, curr9, test);
      helper.waitForElementToBeVisible(ProductsFilterLocator.compare2_product, 10);
      helper.clickOnElement(ProductsFilterLocator.compare2_product);
      String actual10 = Base.driver.findElement(ProductDetailsLocator.verifycompare2product).getText();
      String curr10 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 7, 1);
      Assertion.useAssert(actual10, curr10, test);

    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.INFO, e.getMessage());
    }

  }

  /**
   * @Created by Uday
   * @Description Waits for the first comparison product to be visible and selects
   *              it.
   * @param None
   * @return None
   */

  public void compareButFirsttwo(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(ProductsFilterLocator.compareproduct, 10);
      helper.clickOnElement(ProductsFilterLocator.compareproduct);
      String actual11 = Base.driver.getCurrentUrl();
      String curr11 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 3, 1);
      Assertion.useAssert(actual11, curr11, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.INFO, e.getMessage());
    }
  }

  /**
   * @Created by Uday
   * @Description Removes two selected products by clicking the respective delete
   *              options and confirming the action.
   * @param None
   * @return None
   */

  public void removingProducts(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(ProductsFilterLocator.secondProductwrong, 5);
      helper.clickOnElement(ProductsFilterLocator.secondProductwrong);
      helper.waitForElementToBeVisible(ProductsFilterLocator.OKClick, 10);
      helper.clickOnElement(ProductsFilterLocator.OKClick);
      String actual12 = Base.driver.findElement(ProductDetailsLocator.verifyremoving1product).getText();
      String curr12 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 8, 1);
      Assertion.useAssert(actual12, curr12, test);

      helper.waitForElementToBeVisible(ProductsFilterLocator.firstProductwrong, 5);
      helper.clickOnElement(ProductsFilterLocator.firstProductwrong);
      helper.waitForElementToBeVisible(ProductsFilterLocator.OKClick, 10);
      helper.clickOnElement(ProductsFilterLocator.OKClick);
      String actual13 = Base.driver.findElement(ProductDetailsLocator.verifyremoving2product).getText();
      String curr13 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 9, 1);
      Assertion.useAssert(actual13, curr13, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.INFO, e.getMessage());
    }
  }

  /**
   * @Created by Uday
   * @Description Prints a message after removing products (screenshot
   *              functionality can be added).
   * @param None
   * @return None
   */

  public void afterremoveScreenshot(ExtentTest test) {
    try {
      Screenshot
          .captureScreenShot(ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 4, 1));
      test.log(Status.INFO, ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 5, 1));
      String actual14 = Base.driver.findElement(ProductDetailsLocator.afterremoveallproducts).getText();
      String curr14 = ExcelFileReader.readExcelData(ReadProperties.prop.getProperty("path"), "Uday", 10, 1);
      Assertion.useAssert(actual14, curr14, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.INFO, e.getMessage());
    }
  }

  /**
   * Created by: Mohit
   * Description: Navigates to the login page and simulates user actions like
   * hovering and clicking, Validates the presence and functionality of key UI
   * elements.
   *
   * @param: test ExtentTest instance for logging.
   * @return: null
   */
  public void navigateToLoginPage(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(NavBarLocator.userIcon, 10);
      String expected = ExcelFileReader.readExcelData(path, "Mohit", 6, 0);

      helper.waitForElementToBeVisible(NavBarLocator.shopnow, 15);
      Assertion.useAssert(helper.getText(NavBarLocator.shopnow), expected, test);

      helper.hoverOverElement(NavBarLocator.userIcon);

      helper.waitForElementToBeVisible(NavBarDropDownLocators.login, 10);
      helper.clickOnElement(NavBarDropDownLocators.login);

      helper.waitForElementToBeVisible(LoginModuleLocator.createAccount, 15);
      String verifyLogin = ExcelFileReader.readExcelData(path, "Mohit", 7, 0);
      System.out.println(verifyLogin);
      Assertion.assertionVerifyByContains(helper.getText(LoginModuleLocator.createAccount), verifyLogin, test);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    }
  }

  /**
   * Created by: Mohit
   * Description: Navigates to the "Create Account" page and verifies the
   * visibility of essential UI elements.
   *
   * @param: test ExtentTest instance for logging.
   * @return: null
   */
  public void navigateToCreateAccountPage(ExtentTest test) {
    try {
      helper.waitForElementToBeVisible(LoginModuleLocator.createAccount, 10);
      helper.clickOnElement(LoginModuleLocator.createAccount);
      helper.waitForElementToBeVisible(LoginModuleLocator.firstName, 10);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    }
  }

  /**
   * Created by: Mohit
   * Description: Completes the account creation process by filling in user
   *              details, submitting the form, and validating the thank-you message on the UI.
   * @param: test      ExtentTest instance for logging.
   * @param: firstname User's first name.
   * @param: lastname  User's last name.
   * @param: password  User's account password.
   * @return: null
   */
  public void createAccount(ExtentTest test, String firstname, String lastname, String password) {
    try {
      helper.sendKeys(LoginModuleLocator.firstName, firstname);
      helper.sendKeys(LoginModuleLocator.lastName, lastname);
      helper.sendKeys(LoginModuleLocator.email, generateRandomEmail());
      helper.sendKeys(LoginModuleLocator.password, password);
      helper.sendKeys(LoginModuleLocator.confirmPassword, password);

      helper.clickOnElement(LoginModuleLocator.confirmCreateButton);

      helper.waitForElementToBeVisible(LoginModuleLocator.thankYouMessage, 15);
      String expectedThankYou = ExcelFileReader.readExcelData(path, "Mohit", 8, 0);
      System.out.println(expectedThankYou);

      Assertion.useAssert(helper.getText(LoginModuleLocator.thankYouMessage), expectedThankYou, test);
      Screenshot.captureScreenShot(expectedThankYou);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    }
  }

  /**
   * Created by: Mohit
   * Description: Logs the user out of the application and validates the
   * post-logout state by checking specific UI elements and verifying displayed
   * text.
   *
   * @param: test ExtentTest instance for logging.
   * @return: null
   */
  public void logout(ExtentTest test) {
    try {
      helper.clickOnElement(LoginModuleLocator.logout);
      helper.waitForElementToBeVisible(LoginModuleLocator.verify5secWait, 15);

      String expected5secText = ExcelFileReader.readExcelData(path, "Mohit", 9, 0);
      System.out.println(expected5secText);
      System.out.println("==" + helper.getText(LoginModuleLocator.verify5secWait) + "====");

      Assertion.useAssert(helper.getText(LoginModuleLocator.verify5secWait), expected5secText, test);
      Screenshot.takeScreenShotWithHighlight(LoginModuleLocator.verify5secWait, expected5secText);

      helper.waitForElementToBeVisible(NavBarLocator.shopnow, 15);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    }
  }

  /**
   * Created by: Mohit
   * Description: Performs login using an existing user's credentials and
   * validates the error message on failure.
   *
   * @param: test         ExtentTest instance for logging.
   * @param: userEmail    Email address of the user.
   * @param: userPassword Password of the user.
   * @return: null
   */
  public void loginWithExistingUser(ExtentTest test, String userEmail, String userPassword) {
    try {
      helper.hoverOverElement(NavBarLocator.userIcon);
      helper.clickOnElement(NavBarDropDownLocators.login);

      helper.clickOnElement(LoginModuleLocator.emailLogin);
      helper.sendKeys(LoginModuleLocator.emailLogin, userEmail);

      helper.clickOnElement(LoginModuleLocator.passwordLogin);
      helper.sendKeys(LoginModuleLocator.passwordLogin, userPassword);

      helper.clickOnElement(LoginModuleLocator.signIn);

      helper.waitForElementToBeVisible(LoginModuleLocator.verifyErrorMessage, 15);

      String expectedVerifyError = ExcelFileReader.readExcelData(path, "Mohit", 10, 0);
      System.out.println(expectedVerifyError);

      Assertion.useAssert(helper.getText(LoginModuleLocator.verifyErrorMessage), expectedVerifyError, test);
      Screenshot.captureScreenShot(expectedVerifyError);
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    } catch (AssertionError e) {
      LoggerHandler.info(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    }
  }

  /**
   * Created by: Mohit
   * Description: Generates a random email address by appending a random number to
   * a fixed prefix and suffix.
   * 
   * @param: null
   * @return: A randomly generated email address as a String.
   */
  public String generateRandomEmail() {
    try {
      String prefix = "mohit";
      String suffix = "@gmail.com";
      int randomNumber = new Random().nextInt(10000);
      return prefix + randomNumber + suffix;
    } catch (Exception e) {
      LoggerHandler.error(e.getMessage());
      Hooks.test.log(Status.FAIL, e.getMessage());
    }
    return "";
  }
}
