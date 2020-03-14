import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "email")
    WebElement emailTextBox;
    @FindBy(id = "passwd")
    WebElement passWordTextBox;
    @FindBy(xpath = "//p[@class='submit']//span[1]")
    WebElement loginButton;
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setEmailTextBox(String emailAddress) {
        emailTextBox.sendKeys(emailAddress);
    }

    public void setPassWordTextBox(String password) {
        passWordTextBox.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void login(String username, String password) {
        setEmailTextBox(username);
        setPassWordTextBox(password);
        clickLoginButton();
    }

    public WebElement returnLoginButton() {
        return loginButton;
    }

}
