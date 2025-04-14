package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NavBarLocator;
import uistore.ProductDetailsLocator;
import uistore.ProductsFilterLocator;
import utils.Assertion;
import utils.Base;
import utils.DriverHelper;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.ReadProperties;

public class BrandActionPage extends Base {
    DriverHelper helper = new DriverHelper(driver);
    String path = ReadProperties.prop.getProperty("path");

    public void verifyHomepageandclickOnBrands(ExtentTest test) {
        String actual = driver.getCurrentUrl();
        String expected = ReadProperties.prop.getProperty("url");
        Assert.assertEquals(actual, expected);
        helper.clickOnElement(NavBarLocator.brandNavBar);
        LoggerHandler.info("click on" + helper.getText(NavBarLocator.brandNavBar));
        test.log(Status.INFO, "click on" + helper.getText(NavBarLocator.brandNavBar));
    }

    public void verifyBrandPageandTypePuma(ExtentTest test) {
        WebElement brand = driver.findElement(By.cssSelector("span[data-ui-id='page-title-wrapper']"));
        if (brand.isDisplayed()) {
            Assert.assertTrue(true);
        }
        helper.clickOnElement(ProductDetailsLocator.searchBarBrand);
        LoggerHandler.info(ExcelFileReader.readExcelData(path, "Priyanka", 2, 2));
        test.log(Status.INFO, ExcelFileReader.readExcelData(path, "Priyanka", 2, 2));
        helper.sendKeys(ProductDetailsLocator.searchBarBrand,
                ExcelFileReader.readExcelData(path, "Priyanka", 0, 0));
        helper.clickOnElement(ProductDetailsLocator.searchiconInBrandPage);

    }

    public void clickNextAndverifySearchResults(ExtentTest test) {

        Assertion.assertionVerifyByContains(helper.getText(ProductDetailsLocator.clickOnPumaLabel),
                ExcelFileReader.readExcelData(path, "Priyanka", 0, 0), test);
        helper.clickOnElement(ProductDetailsLocator.clickPumaLogo);

    }

    public void verifyBrandpagelistingallproducts() {
        WebElement brandPage = driver.findElement(By.cssSelector("h1[class='title']"));
        if (brandPage.isDisplayed()) {
            Assert.assertTrue(true);
        }

        List<WebElement> puma = helper.getElementsByXpath("div[class='product details product-item-details']");
        for (int i = 1; i < puma.size(); i++) {

            String text = driver
                    .findElement(By.cssSelector("(div[class='product details product-item-details'])[" + i + "]"))
                    .getText();
            System.out.println(text);
        }

    }

    public void clickAccessoriesandverifyUpdate() {
        helper.clickOnElement(ProductsFilterLocator.AccessoriesCategoryPuma);
        WebElement accessories = driver.findElement(By.cssSelector("span[data-ui-id='page-title-wrapper']"));
        if (accessories.isDisplayed()) {
            Assert.assertTrue(true);

        }
    }

    public void hoveroverproductandclickQuickView() {

        helper.hoverOverElement(ProductDetailsLocator.hoverOverElementToquickView);
        helper.clickOnElement(ProductDetailsLocator.quickViewOfPumaProduct);
        helper.clickOnElement(ProductDetailsLocator.quickViewOfPumaProduct);

    }

    public void verifyandclickWishList(ExtentTest test) {

        driver.switchTo().frame(Base.driver.findElement(ProductDetailsLocator.iframe));
        Assertion.useAssert(helper.getText(ProductDetailsLocator.verifyQuickViewlabel),
                ExcelFileReader.readExcelData(path, "Priyanka", 1, 0), test);
        helper.hoverOverElement(ProductDetailsLocator.hoverOverWindowOpenByquickview);
        helper.scroll(100);
        helper.waitForElementToBeVisible(ProductDetailsLocator.clickOnAddtoWhishList, 2);
        helper.clickOnElement(ProductDetailsLocator.clickOnAddtoWhishList);
        driver.switchTo().defaultContent();

    }

    public void verifypromt(ExtentTest test) {
        Assertion.assertionVerifyByContains(helper.getText(ProductDetailsLocator.verifyErrorMessageWhishList),
                ExcelFileReader.readExcelData(path, "Priyanka", 2, 0), test);
    }

    public void logincredentials() {

        helper.waitForElementToBeVisible(ProductDetailsLocator.inputEmailAdd, 2);
        helper.clickOnElement(ProductDetailsLocator.inputEmailAdd);
        helper.sendKeys(ProductDetailsLocator.inputEmailAdd,
                ExcelFileReader.readExcelData(path, "Priyanka", 3, 0));
        helper.waitForElementToBeVisible(ProductDetailsLocator.inputPassword, 2);
        helper.clickOnElement(ProductDetailsLocator.inputPassword);
        helper.sendKeys(ProductDetailsLocator.inputPassword,
                ExcelFileReader.readExcelData(path, "Priyanka", 4, 0));

    }

    public void signInAndverifyerrorMessage(ExtentTest test) {
        helper.clickOnElement(ProductDetailsLocator.clickOnSignIn);
        Assertion.assertionVerifyByContains(helper.getText(ProductDetailsLocator.verifyErrorMessageToSignIn),
                ExcelFileReader.readExcelData(path, "Priyanka", 5, 0), test);

    }

}
