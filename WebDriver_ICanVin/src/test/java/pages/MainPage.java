package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }
    private By pasteCodeWindow = By.name("PostForm[text]");
    private By expirationPushing = By.id("select2-postform-expiration-container");
    private By textExpiration = By.xpath("//li[text()='10 Minutes']");
    private By textNameForm = By.name("PostForm[name]");
    private By createPasteButton = By.xpath("//button[@class='btn -big']");

    public MainPage openPage(){
        driver.get("https://pastebin.com");
        return this;
    }
    public MainPage writeTextToCodeWindow(String codeForNewPaste){
        driver.findElement(pasteCodeWindow).sendKeys(codeForNewPaste);
        return new MainPage(driver);
    }
    public MainPage selectExpiration(){
        driver.findElement(expirationPushing).click();
        driver.findElement(textExpiration).click();
        return new MainPage(driver);
    }
    public MainPage writeTextToNameWindow(String textForNameWindow){
        driver.findElement(textNameForm).sendKeys(textForNameWindow);
        return new MainPage(driver);
    }
    public MainPage tapCreateNewPaste(){
        driver.findElement(createPasteButton).click();
        return new MainPage(driver);
    }
}