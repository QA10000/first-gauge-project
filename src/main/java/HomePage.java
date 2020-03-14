import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "search_query_top")
    WebElement searchTextBox;
    @FindBy(xpath = "//button[@name='submit_search']")
    WebElement submitSearchButton;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setSearchTextBox(String searchItem) {
        searchTextBox.sendKeys(searchItem);
    }

    public void clickSearchButton() {
        submitSearchButton.click();
    }

    public void search(String searchItem) {
        setSearchTextBox(searchItem);
        clickSearchButton();
    }

    public WebElement getSearchTextBox() {
        return searchTextBox;
    }

    public WebElement getSubmitSearchButton() {
        return submitSearchButton;
    }
}
