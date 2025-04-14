package utils;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class Base {

    public static WebDriver driver;

    /**
     * @Created by Uday
     * @Description Opens the browser, sets up WebDriver with properties from the
     *              configuration file,
     *              and initializes browser settings such as maximized window,
     *              timeouts, and listeners.
     *
     * @param None
     * @return None
     */
    public void openBrowser() {
        try {
            // Load properties from the configuration file
            ReadProperties.loadProperties();

            // Initialize RemoteWebDriver with grid URL and Chrome options
            URL gridUrl = new URL(ReadProperties.prop.getProperty("gridurl"));
            driver = new RemoteWebDriver(gridUrl, new ChromeOptions());

            if (driver != null) {
                // Browser configurations
                driver.manage().window().maximize();
                driver.manage().timeouts()
                        .implicitlyWait(Duration.ofSeconds(Integer.parseInt(ReadProperties.prop.getProperty("iwait"))));
                driver.get(ReadProperties.prop.getProperty("url"));
                driver.manage().timeouts()
                        .pageLoadTimeout(
                                Duration.ofSeconds(Integer.parseInt(ReadProperties.prop.getProperty("pwait"))));
            }

            // Attach event listener for WebDriver events
            WebDriverListener listener = new EventHandler();
            driver = new EventFiringDecorator<>(listener).decorate(driver);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}