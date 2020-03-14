import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Driver;

public class SearchResultPage {

    @FindBy(xpath = "//label[text()='Condition ' ]/following::span[1]") WebElement checkConditionLabel;
    WebDriver driver = Driver.driver;

    public SearchResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getSearchResult(String itemName) {
        return driver.findElement(By.xpath("//div[@class='right-block']//a[contains(text()," + "'" + itemName + "')]"));
    }

}
