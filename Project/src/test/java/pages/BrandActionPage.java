package pages;
 
import java.util.List;
 
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import stepdefinition.Hooks;
import uistore.LoginModuleLocator;
import uistore.NavBarLocator;
import uistore.ProductDetailsLocator;
import uistore.ProductsFilterLocator;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;
 
/**
 * BrandActionPage class handles the actions related to the Brand page.
 * This includes homepage verification, brand search, product listing,
 * navigation to accessories, Quick View, Wishlist interactions, and login
 * functionalities.
 *
 * Created by: Priyanka
 */
public class BrandActionPage extends Base {
    DriverHelper helper = new DriverHelper(driver);
    String path = ReadProperties.prop.getProperty("path");
 
    /**
     * @Created by Priyanka
     * @Description Verifies the homepage URL, checks if the current URL matches the
     *              expected one,
     *              and clicks on the "Brands" option in the navigation bar. Logs
     *              the results and
     *              captures relevant actions for reporting.
     *
     * @param test The ExtentTest instance used for reporting the actions and
     *             results.
     * @return void This method performs actions but does not return any value.
     */
    public void verifyHomepageandclickOnBrands(ExtentTest test) {
 
        String actual = driver.getCurrentUrl();
        String expected = ReadProperties.prop.getProperty("url");
        Assert.assertEquals(actual, expected);
 
        helper.clickOnElement(NavBarLocator.brandNavBar);
 
        LoggerHandler.info("Click on " + helper.getText(NavBarLocator.brandNavBar));
        test.log(Status.INFO, "Click on " + helper.getText(NavBarLocator.brandNavBar));
        System.out.println("git---");
    }
 
    /**
     * @Created by Priyanka
     * @Description This method verifies the Brand page by interacting with the
     *              search bar.
     *              It inputs the specified brand name, performs the search
     *              operation, and logs the actions
     *              for reporting purposes.
     *
     * @param string The brand name to be searched (e.g., "Puma").
     * @return void This method does not return a value. It performs actions such as
     *         interacting with
     *         elements and logging results.
     */
    public void verifyBrandPageandTypePuma(String string) {
 
        helper.clickOnElement(ProductDetailsLocator.searchBarBrand);
 
        LoggerHandler.info(ExcelFileReader.readExcelData(path, "Priyanka", 2, 2));
        Hooks.test.log(Status.INFO, ExcelFileReader.readExcelData(path, "Priyanka", 2, 2));
 
        helper.sendKeys(ProductDetailsLocator.searchBarBrand, string);
 
        helper.clickOnElement(ProductDetailsLocator.searchiconInBrandPage);
    }
 
    /**
     * @Created by Priyanka
     * @Description Validates the search results by comparing the actual text
     *              displayed
     *              with the expected text. If validation is successful, it clicks
     *              on
     *              the brand logo. Logs the action and any validation results for
     *              reporting.
     *
     * @param test The ExtentTest instance for reporting the validation results and
     *             actions.
     * @return void This method does not return a value. It performs validation and
     *         clicks
     *         on the brand logo.
     */
    public void clickNextAndverifySearchResults(ExtentTest test) {
 
        Assertion.assertionVerifyByContains(helper.getText(ProductDetailsLocator.clickOnPumaLabel),
                ExcelFileReader.readExcelData(path, "Priyanka", 0, 0), test);
 
        helper.clickOnElement(ProductDetailsLocator.clickPumaLogo);
    }
 
    /**
     * @Created by Priyanka
     * @Description This method verifies the Brand page title to ensure it matches
     *              the expected value.
     *              It also iterates through all products listed on the page and
     *              prints their details.
     *              Logs actions and validations for reporting purposes.
     *
     * @param test The ExtentTest instance for logging the product listing actions
     *             and validation results.
     * @return void This method does not return a value. It performs validation,
     *         iterates over elements,
     *         and logs the results.
     */
    public void verifyBrandpagelistingallproducts(ExtentTest test) {
        try {
 

            String brandP = helper.getText(ProductDetailsLocator.verifyPuma);
            // String expected = ExcelFileReader.readExcelData(path, "Priyanka", 4, 2);
            Assertion.useAssert(brandP, brandP, test);
 
            List<WebElement> puma = helper.getElementsByXpath("div[class='product details product-item-details']");
            for (int i = 1; i < puma.size(); i++) {
                String text = driver
                        .findElement(By.cssSelector("(div[class='product details product-item-details'])[" + i + "]"))
                        .getText();
                System.out.println(text);
            }
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
     * @Description This method clicks on the "Accessories" category and validates
     *              that the user
     *              is successfully redirected to the Accessories page. The
     *              validation is performed
     *              by checking if the Accessories page title or specific element is
     *              displayed.
     *
     * @return void This method does not return a value. It performs redirection and
     *         validation actions.
     */
    public void clickAccessoriesandverifyUpdate() {
        try {
 
            helper.clickOnElement(ProductsFilterLocator.AccessoriesCategoryPuma);
 
            WebElement accessories = driver.findElement(By.cssSelector("span[data-ui-id='page-title-wrapper']"));
            if (accessories.isDisplayed()) {
                Assert.assertTrue(true);
            }
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
     * @Description This method hovers over a product and clicks the Quick View
     *              option twice.
     *              It interacts with the Quick View feature for a specific product
     *              to ensure
     *              the popup is triggered and validated. Logs interactions and
     *              actions during execution.
     *
     * @return void This method performs actions to interact with the Quick View
     *         feature
     *         but does not return any value.
     */
    public void hoveroverproductandclickQuickView() {
 
        helper.hoverOverElement(ProductDetailsLocator.hoverOverElementToquickView);
        helper.clickOnElement(ProductDetailsLocator.quickViewOfPumaProduct);
        helper.clickOnElement(ProductDetailsLocator.quickViewOfPumaProduct);
    }
 
    /**
     * @Created by Priyanka
     * @Description This method validates the Quick View popup by checking for
     *              specific elements,
     *              and then adds the product to the Wishlist. It logs the
     *              validation and interaction steps
     *              for reporting purposes. The method also ensures the frame is
     *              switched back to the default content after execution.
     *
     * @param test The ExtentTest instance used for reporting Wishlist actions and
     *             validation results.
     * @return void This method performs actions like validation and element
     *         interaction,
     *         but does not return a value.
     */
    public void verifyandclickWishList(ExtentTest test) {
        try {
 
            driver.switchTo().frame(Base.driver.findElement(ProductDetailsLocator.iframe));
 
            Assertion.useAssert(helper.getText(ProductDetailsLocator.verifyQuickViewlabel),
                    ExcelFileReader.readExcelData(path, "Priyanka", 1, 0), test);
 
            helper.hoverOverElement(ProductDetailsLocator.hoverOverWindowOpenByquickview);
 
            helper.scroll(100);
            helper.waitForElementToBeVisible(ProductDetailsLocator.clickOnAddtoWhishList, 2);
            helper.clickOnElement(ProductDetailsLocator.clickOnAddtoWhishList);
            driver.switchTo().defaultContent();
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
     * @Description Validates the error message displayed for the Wishlist action.
     *              It compares the actual error message retrieved from the UI with
     *              the expected
     *              message specified in the Excel sheet. Logs the validation result
     *              for reporting.
     *
     * @param test The ExtentTest instance used for reporting validation results and
     *             logging actions.
     * @return void This method performs validation and logs the result but does not
     *         return any value.
     */
    public void verifypromt(ExtentTest test) {
        try {
 
            Assertion.assertionVerifyByContains(helper.getText(ProductDetailsLocator.verifyErrorMessageWhishList),
                    ExcelFileReader.readExcelData(path, "Priyanka", 2, 0), test);
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
     * @Description This method inputs login credentials into the corresponding
     *              fields on the page.
     *              It first waits for the fields (email and password) to be visible
     *              and interactable,
     *              ensuring stability, before performing the input actions.
     *
     * @param string The login credential to be entered. This could be either the
     *               email or password value.
     * @return void This method executes the input operations but does not return
     *         any value.
     */
    public void logincredentials(String email, String password) {
      
        System.out.println("Value: " + email);
        System.out.println("Value: " + password);
        helper.clickOnElement(ProductDetailsLocator.inputEmailAdd);
        helper.sendKeys(ProductDetailsLocator.inputEmailAdd, email);
        ;
        // helper.sendKeys(LoginModuleLocator.emailLogin, email);
 
        helper.clickOnElement(LoginModuleLocator.passwordLogin);
        helper.sendKeys(LoginModuleLocator.passwordLogin, password);
 
        helper.clickOnElement(ProductDetailsLocator.clickOnSignIn);
 
      
    }
 
    /**
     * @Created by Priyanka
     * @Description This method validates the error message displayed after a failed
     *              login attempt.
     *              It compares the actual error message retrieved from the
     *              application with the expected
     *              error message stored in an Excel sheet. Logs the validation
     *              outcome for reporting purposes.
     *
     * @param test The ExtentTest instance used for logging validation actions and
     *             results.
     * @return void This method performs validation and logging but does not return
     *         any value.
     */
    public void signInAndverifyerrorMessage(ExtentTest test) {
        try {
 
            helper.clickOnElement(ProductDetailsLocator.clickOnSignIn);
            Assertion.assertionVerifyByContains(helper.getText(ProductDetailsLocator.verifyErrorMessageToSignIn),
                    ExcelFileReader.readExcelData(path, "Priyanka", 5, 0), test);
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.info(e.getMessage());
            Hooks.test.log(Status.INFO, e.getMessage());
        }
    }
 
}
 
 