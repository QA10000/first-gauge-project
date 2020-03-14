import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.Driver;

public class LoginPageStepImpl {

    WebDriver driver = Driver.driver;

    LoginPage loginPage = new LoginPage(driver);

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Step("User login into marketplace using username <username> and password <password>")
    public void login(String username, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.returnLoginButton()));
        loginPage.login(username, password);
    }

    @Step("Verify title of login page")
    public void validateLoginPage() {
        Assert.assertEquals(driver.getTitle(), "Login - My Store");
    }

}
