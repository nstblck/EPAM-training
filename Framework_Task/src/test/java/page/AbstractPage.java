package page;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    WebDriver driver;
    protected AbstractPage(WebDriver driver){
        this.driver = driver;
    }

    public abstract CloudCalculatorPage openCloudPage();
}
