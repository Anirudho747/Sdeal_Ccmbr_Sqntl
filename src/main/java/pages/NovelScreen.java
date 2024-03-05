package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import wrpr.Wrap;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class NovelScreen extends Wrap {

    @AndroidFindBy()
    @iOSXCUITFindBy()
    protected WebElement filterButton;
}
