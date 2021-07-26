package pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    WebDriver driver;
    BasePage(WebDriver driver){
        this.driver = driver;
    }
}
//переименовтаь класс в бэйс пэйдж и мэин тоже