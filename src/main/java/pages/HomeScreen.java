package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import wrpr.Wrap;

public class HomeScreen extends Wrap {


    @AndroidFindBy(id="hamburger_icon_new")
    @iOSXCUITFindBy()
    protected WebElement snapDealLabel;

    @AndroidFindBy(id="search_text_view")
    @iOSXCUITFindBy()
    protected WebElement searchBar;

    @AndroidFindBy(id="search_edit_text")
    @iOSXCUITFindBy()
    protected WebElement textBar;

    public HomeScreen()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @Given("user is at Homescreen")
    public void userIsAtHomescreen() {
    }

    @When("user searches for {string}")
    public void userSearchesFor(String arg0) {
    }

}
