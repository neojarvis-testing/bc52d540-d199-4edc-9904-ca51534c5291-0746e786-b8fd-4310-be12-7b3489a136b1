package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.google.common.io.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Base {

    public static TakesScreenshot ts = (TakesScreenshot) driver;

    /**
     * @Created by Priyanka
     * @Description Captures a screenshot and saves it with the provided filename
     *              and timestamp.
     * @param filename The base name for the screenshot file.
     */
    public static void captureScreenShot(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);

        // Create the screenshots directory if it doesn't exist
        File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }

        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @Created by Priyanka
     * @Description Captures a screenshot with a highlighted element using the
     *              provided locator and saves it with the filename.
     * @param locator  The locator of the WebElement to highlight.
     * @param filename The base name for the screenshot file.
     */
    public static void takeScreenShotWithHighlight(By locator, String filename) {
        try {
            WebElement Element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='3px solid red'", Element);

            Thread.sleep(2000);

            File fs = ts.getScreenshotAs(OutputType.FILE);
            File target = new File(System.getProperty("user.dir") + "/screenshots/");
            if (!target.exists()) {
                target.mkdirs();
            }
            FileHandler.copy(fs, new File(target.toString() + "/" + filename + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}