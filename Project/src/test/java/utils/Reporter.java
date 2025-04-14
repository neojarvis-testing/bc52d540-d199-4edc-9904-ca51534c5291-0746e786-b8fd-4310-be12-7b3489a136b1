package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.TimeZone;
import com.google.common.io.Files;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reporter {

    public static TakesScreenshot ts;
    private static Properties prop;
    private static ExtentReports extentReport;

    /**
     * @Created by Harshit Gupta
     * @Description Generates an ExtentReports instance without a report name.
     * @return ExtentReports instance.
     */
    public static ExtentReports generateExtentReport() {
        return generateExtentReport(null);
    }

    /**
     * @Created by Harshit Gupta
     * @Description Generates an ExtentReports instance with an optional report name.
     * @param reportName The name of the report file.
     * @return ExtentReports instance.
     */
    public static ExtentReports generateExtentReport(String reportName) {
        if (extentReport == null) {
            extentReport = createExtentReport(reportName);
        }
        return extentReport;
    }

    /**
     * @Created by Harshit Gupta
     * @Description Creates and initializes an ExtentReports instance with detailed configuration.
     * @param reportName The name of the report file.
     * @return ExtentReports instance.
     */
    public static ExtentReports createExtentReport(String reportName) {
        ExtentReports extentReport = new ExtentReports();

        // Load properties from config.properties file
        String filepath = System.getProperty("user.dir") + "/config/config.properties";
        try {
            FileInputStream file = new FileInputStream(filepath);
            prop = new Properties();
            prop.load(file);
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }

        // Generate a timestamp for the report name
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
        dateFormat.setTimeZone(istTimeZone);
        String timestamp = dateFormat.format(new Date());

        // Set the report file path
        String reportFilePath = System.getProperty("user.dir") + "/reports/";
        if (reportName == null || reportName.isEmpty()) {
            reportName = "Test Report";
        }
        reportFilePath += reportName + "_" + timestamp + ".html";

        File extentReportFile = new File(reportFilePath);

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setReportName("Test Report");
        sparkReporter.config().setDocumentTitle("Test Automation Report");
        sparkReporter.config().setTimeStampFormat("yyyy.MM.dd.HH.mm.ss");

        extentReport.attachReporter(sparkReporter);
        extentReport.setSystemInfo("Application URL", prop.getProperty("url"));

        return extentReport;
    }

    /**
     * @Created by Harshit Gupta
     * @Description Captures a screenshot of the current browser state and saves it to the specified path.
     * @param filename The base name for the screenshot file.
     * @param driver The WebDriver instance for the browser.
     * @return The file path of the saved screenshot.
     */
    public static String captureScreenShot(String filename, WebDriver driver) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";

        String destPath = "./" + name;

        ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);

        // Create the screenshots directory if it doesn't exist
        File screenshotsDir = new File(System.getProperty("user.dir") + "/reports");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }

        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destPath;
    }

    /**
     * @Created by Harshit Gupta
     * @Description Attaches a screenshot to an ExtentTest report with the provided description.
     * @param filename The base name for the screenshot file.
     * @param test The ExtentTest instance to attach the screenshot to.
     * @param description Description of the screenshot.
     * @param driver The WebDriver instance for the browser.
     */
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description,
            WebDriver driver) {
        try {
            test.log(Status.INFO, description,
                    MediaEntityBuilder.createScreenCaptureFromPath(captureScreenShot(filename, driver)).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}