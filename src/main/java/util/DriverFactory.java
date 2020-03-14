package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

    private static String browserName = System.getenv("browser");

    public static WebDriver getDriver() {
        if(browserName == null){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        switch (browserName) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "ie":
                WebDriverManager.iedriver().setup();
                return new InternetExplorerDriver();
            default:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
        }
    }

}
