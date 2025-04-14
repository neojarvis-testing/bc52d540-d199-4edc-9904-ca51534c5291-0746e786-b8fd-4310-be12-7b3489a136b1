package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class DriverHelper {
    private WebDriver driver;

    /**
     * @Created by Lokesh
     * @Description Constructor to initialize the WebDriver.
     * @param driver WebDriver instance.
     */
    public DriverHelper(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @Created by Lokesh
     * @Description Waits for an element to be visible within the specified timeout
     *              duration.
     * @param locator          Locator for the element.
     * @param timeoutInSeconds Timeout duration in seconds.
     * @return None
     */
    public void waitForElementToBeVisible(By locator, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Created by Lokesh
     * @Description Clicks on the specified element.
     * @param locator Locator for the element.
     * @return None
     */
    public void clickOnElement(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Created by Lokesh
     * @Description Sends the provided text to the specified element.
     * @param locator Locator for the element.
     * @param data    Text to be sent.
     * @return None
     */
    public void sendKeys(By locator, String data) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Created by Lokesh
     * @Description Retrieves text from the specified element.
     * @param locator Locator for the element.
     * @return Text from the element. Returns a blank space if an exception occurs.
     */
    public String getText(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            return webElement.getText();
        } catch (Exception e) {
            e.printStackTrace();
            return " ";
        }
    }

    /**
     * @Created by Lokesh
     * @Description Sends the ENTER key action to the specified element.
     * @param locator Locator for the element.
     * @return None
     */
    public void enterAction(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Created by Lokesh
     * @Description Performs a hover-over action on the specified element.
     * @param locator Locator for the element.
     * @return None
     */
    public void hoverOverElement(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Created by Lokesh
     * @Description Switches to a new window, excluding the parent window.
     * @return None
     */
    public void switchToNewWindow() {
        try {
            String parentId = driver.getWindowHandle();
            Set<String> childIds = driver.getWindowHandles();

            for (String id : childIds) {
                if (!parentId.equals(id)) {
                    driver.switchTo().window(id);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Created by Lokesh
     * @Description Scrolls the page vertically by the specified pixel value.
     * @param pixel The number of pixels to scroll vertically.
     * @return None
     */
    public void scroll(int pixel) {
        JavascriptExecutor js = (JavascriptExecutor) Base.driver;
        js.executeScript("window.scrollBy(0," + pixel + ")", "");
    }

    /**
     * @Created by Lokesh
     * @Description Retrieves all elements matching the specified XPath.
     * @param locator XPath locator for the elements.
     * @return List of matching elements. Returns null if an exception occurs.
     */
    public List<WebElement> getElementsByXpath(String locator) {
        try {
            List<WebElement> elements = driver.findElements(By.xpath(locator));
            return elements;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}