import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.datastore.DataStore;
import com.thoughtworks.gauge.datastore.DataStoreFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.IExpectedExceptionsHolder;
import util.Driver;

public class SearchResultPageImpl {

    WebDriver driver = Driver.driver;

    WebDriverWait wait = new WebDriverWait(driver, 10);
    HomePage homepage = new HomePage(driver);
    SearchResultPage searchResultPage = new SearchResultPage(driver);
    DataStore dataStore = DataStoreFactory.getSuiteDataStore(); // creating a data store object


    @Step("User search for item <item>")
    public void searchItem (String item) {
        wait.until(ExpectedConditions.visibilityOf(homepage.getSearchTextBox()));
        wait.until(ExpectedConditions.elementToBeClickable(homepage.getSubmitSearchButton()));// for buttons we use condition to be clickable
        homepage.search(item);
        dataStore.put("searchText", item); // putting value in data store
    }

    @Step("Verify search result")
    public void verifyItem() {
        String item = (String) dataStore.get("searchText");
        wait.until(ExpectedConditions.visibilityOf(searchResultPage.getSearchResult(item)));
    }

    @Step("Test")
    public void test() {
        String item = (String) dataStore.get("searchText"); // storing datastore value in item variable
        Gauge.writeMessage(item); // it prints value in html report for the parameter
        Assert.assertNotNull(item);
    }

    @Step("Test3")
    public void test3() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
