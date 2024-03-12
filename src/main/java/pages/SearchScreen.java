package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import wrpr.Wrap;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class SearchScreen extends Wrap {

    @AndroidFindBy(id="mFilterClickView")
    @iOSXCUITFindBy()
    protected WebElement filterButton;

    @AndroidFindBy(xpath="//*[contains(@text,'Rating')]")
    @iOSXCUITFindBy()
    protected WebElement customerRating;

    @AndroidFindBy(xpath="//*[contains(@text,'4.0')]")
    @iOSXCUITFindBy()
    protected WebElement ratingAbove4;

    @AndroidFindBy(xpath="//*[contains(@text,'Discount')]")
    @iOSXCUITFindBy()
    protected WebElement discount;

    @AndroidFindBy(xpath="//*[contains(@text,'0 - 10')]")
    @iOSXCUITFindBy()
    protected WebElement discountUpto10;

    @AndroidFindBy(id="applyFilterButton")
    @iOSXCUITFindBy()
    protected WebElement applyFilter;

    @AndroidFindBy(xpath="//*[contains(@text,'Showing results for')]")
    @iOSXCUITFindBy()
    protected WebElement showingResultsLabel;

    @AndroidFindBy(xpath="(//*[contains(@text,'novels')])[1]")
    @iOSXCUITFindBy()
    protected WebElement thrillerNovelsLabel;

    @AndroidFindBy(xpath="//*[contains(@text,'Sort')]")
    @iOSXCUITFindBy()
    protected WebElement sortButton;

    @AndroidFindBy(xpath="//*[contains(@text,'Discount')]")
    @iOSXCUITFindBy()
    protected WebElement sortByDiscount;

    public SearchScreen()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @And("user taps on Filter")
    public void userTapsOnFilter() {
    }

    @And("selects Customer rating of {int} and above")
    public void selectsCustomerRatingOfAndAbove(int arg0) {
    }

    @And("discount of {string}")
    public void discountOf(String arg0) {
    }

    @And("taps om Apply Filter")
    public void tapsOmApplyFilter() {
    }

    @Then("user is moved to result screen")
    public void userIsMovedToResultScreen() {
    }

    @And("screen has matching labels")
    public void screenHasMatchingLabels() {
    }

}
