package util;

import com.maxsoft.webdrivermanager.driver.DriverFactory;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;

public class Driver {

    private static final String BROWSER = System.getenv("browser"); // broser came from java property file from any property file  which ever browser we put in maven command
    public static WebDriver driver;

    @BeforeScenario
    public void startBrowser() {
        driver = DriverFactory.getDriver(BROWSER);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @AfterScenario
    public void closeBrowser() {
        driver.quit();
    }
}


