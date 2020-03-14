import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.Driver;

public class HomePageStepImpl {

    WebDriver driver = Driver.driver;

    @Step("Verify title of home page")
    public void validateHomePage() {
        Assert.assertEquals(driver.getTitle(), "My account - My Store");
    }

}
