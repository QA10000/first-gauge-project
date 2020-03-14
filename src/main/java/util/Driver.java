package util;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;

public class Driver {

    public static WebDriver driver;

    @BeforeScenario
    public void startBrowser() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @AfterScenario
    public void closeBrowser() {
        driver.quit();
    }
}


