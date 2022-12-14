package utils;

import dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver() {
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                default:
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFox();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver!=null){
                driver.quit();
                driver.close();
                driver = null;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
