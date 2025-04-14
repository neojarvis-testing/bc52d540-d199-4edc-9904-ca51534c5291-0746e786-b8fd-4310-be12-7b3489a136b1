package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    public static FileInputStream file;
    public static Properties prop;

    /**
     * @Created by Mohit
     * @Description Loads properties from a configuration file located at
     *              "config/browser.properties".
     *              This method initializes the FileInputStream and Properties
     *              objects to read property values.
     * 
     * @param None
     * @return None
     */
    public static void loadProperties() {
        String propertiesPath = System.getProperty("user.dir") + "/config/config.properties";
        try {
            file = new FileInputStream(propertiesPath);
            prop = new Properties();
            prop.load(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
