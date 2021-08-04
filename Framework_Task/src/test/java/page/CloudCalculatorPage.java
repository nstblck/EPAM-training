package page;

import com.google.common.base.CharMatcher;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import service.KeysToSendReader;

import static org.testng.AssertJUnit.assertEquals;

public class CloudCalculatorPage extends AbstractPage {
    private static final String KEYS_FOR_SEARCH_CALC = "keys.to.send.for.search.calculator";

    public CloudCalculatorPage(WebDriver driver) {
        super(driver);
    }

    private final Logger logger = LogManager.getRootLogger();

    private By googleSearchSmallButton = By.xpath("//input[@class='devsite-search-field devsite-search-query']");
    private By searchForm = By.className("devsite-search-form");
    //private By linkToCalculator = By.xpath("//b[text()='Google Cloud Platform Pricing Calculator']/parent::a");
    //private By linkToCalculator = By.xpath("//a[text()='Google Cloud Platform Pricing Calculator']/parent::div");
    private By linkToCalculator = By.xpath("//a[@href='https://cloud.google.com/products/calculator?hl=en']/parent::div");
    private By computeEngineSection = By.xpath("//*[@class='tab-holder compute']/parent::md-tab-item");//нашло, не трогай
    private By numberOfInstances = By.xpath("//md-input-container/child::input[@ng-model='listingCtrl.computeServer.quantity']");//тут поломано
    private By operatingSystemMenu = By.xpath("//md-input-container[@class='flex md-input-has-value']");
    private By operatingSystem = By.xpath("//md-option[@value='free']");
    private By machineClassContainer = By.xpath("//md-input-container[@class='md-input-has-placeholder flex md-input-has-value']");
    //private By machineClass = By.id("select_option_81");
    private By machineClass = By.id("select_option_82");
    private By typeOfSeries = By.xpath("//md-select[@name='series']/parent::md-input-container");
    private By series = By.xpath("//md-option[@value='n1']");
    //private By machineTypeContainer = By.xpath("//label[text()='Machine type']/parent::md-input-container");
    private By machineTypeContainer = By.id("select_94");
    private By machineType = By.xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']");
    //private By machineType = By.xpath("//div[text()='n1-standard-8 (vCPUs: 8, RAM: 30GB)']");
    private By addGPUsCheckBox = By.xpath("//md-checkbox[@ng-model='listingCtrl.computeServer.addGPUs']");
    //private By numbersOfGPUs = By.id("select_431");//было 416
    private By numbersOfGPUs = By.xpath("//md-select[@placeholder='Number of GPUs']");
    private By numberOfGPusOne = By.id("select_option_436");//было 436
    private By typesOfGPUsContainer = By.xpath("//md-select[@placeholder='GPU type']");
    private By typeOfGPUs = By.xpath("//md-option[@value='NVIDIA_TESLA_V100']");
    private By variablesLocalSSD = By.xpath("//md-select[@placeholder='Local SSD']");
    //private By localSSDType = By.id("select_option_418");//было 414
    private By localSSDType = By.cssSelector("md-option[value='2'][ng-repeat='item in listingCtrl.dynamicSsd.computeServer']");//было 414
    private By dataCenterLocation = By.xpath("//md-select[@placeholder='Datacenter location']");
    private By locationFrankfurt = By.cssSelector("md-select-menu[class='md-overflow']" +
           " md-option[value='europe-west3'][ng-repeat*='fullRegionList']");
//private By locationFrankfurt = By.xpath("//md-option[@value='europe-west3']");
    private By committedUsage = By.xpath("//md-select[@placeholder='Committed usage']");
    private By usageOneYear = By.id("select_option_101");//было 100
    private By addToEstimateButton = By.xpath("//button[@aria-label='Add to Estimate']");
    private By emailEstimateButton = By.id("email_quote");
    private By forPasteMailField = By.cssSelector("input[name=description][type=email]");
    //private By forPasteMailField = By.id("input_417");
    private By sendMailButton = By.xpath("//button[@aria-label='Send Email']");
    private By iframeGoogle = By.xpath("//iframe[contains(@name,'goog_')]");
    private By copyCreatedMailButton = By.xpath("//button[@class='btn-rds icon-btn bg-theme click-to-copy']");//кнопка "скопировать", работает
    private By inboxPreviewMail = By.xpath("//span[contains (text(),'Google Cloud Sales')]/parent::a");
    private By countFromMail = By.xpath("//h3[contains (text(), 'USD 1,083.33')]/parent::td");

    String keyForNumberOfInstances = String.valueOf(4);
    String keysToSendForSearchCalculator = "Google Cloud Platform Pricing Calculator";
    private final String CloudUrl = "https://cloud.google.com/";

//    @FindBy(xpath = "//button[@aria-label='Add to Estimate']")
//    private WebElement addToEstimateButton;

//    @FindBy(id = "//button[@aria-label='Send Email']")
//    private WebElement sendMailButton;

    public CloudCalculatorPage openCloudPage() {
        driver.get(CloudUrl);
        logger.info("Cloud google page opened");
        return this;
    }

    public CloudCalculatorPage searchCalculatorPage() {
        driver.findElement(searchForm).click();
        WebElement textForGoogleSearch = driver.findElement(googleSearchSmallButton);
        textForGoogleSearch.click();
        textForGoogleSearch.sendKeys(keysToSendForSearchCalculator);
        //textForGoogleSearch.sendKeys(KeysToSendReader.getKeyData(KEYS_FOR_SEARCH_CALC));
        textForGoogleSearch.sendKeys(Keys.ENTER);
        driver.findElement(linkToCalculator).click();
        logger.info("Google cloud calculator opened");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage selectComputeEngine() {
        WebElement element = driver.findElement(iframeGoogle);
        driver.switchTo().frame(element);
        driver.switchTo().frame("myFrame");
        driver.findElement(computeEngineSection).click();
        logger.info("Compute Engine selected");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage fillInstancesField() {
        WebElement instance = driver.findElement(numberOfInstances);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(instance));
        wait.until(ExpectedConditions.elementToBeClickable(instance));
        instance.click();
        instance.sendKeys(keyForNumberOfInstances);
        logger.info("Instance field fill");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage selectOperatingSystem() {
        driver.findElement(operatingSystemMenu).click();
        driver.findElement(operatingSystem).click();
        logger.info("Operating system selected");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage selectMachineClass() {
        driver.findElement(machineClassContainer).click();
        driver.findElement(machineClass).click();
        logger.info("Machine class was selected");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage selectSeries() {
        driver.findElement(typeOfSeries).click();
        driver.findElement(series).click();
        logger.info("Series was selected");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage selectInstanceType() {
        driver.findElement(machineTypeContainer).click();
        driver.findElement(machineType).click();
        logger.info("Instance Type was selected");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage selectCheckboxCPU() {
        driver.findElement(addGPUsCheckBox).click();
        logger.info("Checkbox CPU was checked");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage selectNumbersOfCPUs() {
        driver.findElement(numbersOfGPUs).click();
        driver.findElement(numberOfGPusOne).click();
        logger.info("Numbers Of CPUs was selected");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage selectGPUType() {
        driver.findElement(typesOfGPUsContainer).click();
        driver.findElement(typeOfGPUs).click();
        logger.info("Type of CPU was selected");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage selectLocalSSD() {
        driver.findElement(variablesLocalSSD).click();
        WebElement ssd = driver.findElement(localSSDType);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(ssd));
        wait.until(ExpectedConditions.elementToBeClickable(ssd));
        ssd.click();
        //driver.findElement(localSSDType).click();
        logger.info("Local SSD was selected");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage selectDataCenterLocation() {
        driver.findElement(dataCenterLocation).click();
        WebElement location = driver.findElement(locationFrankfurt);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(location));
        wait.until(ExpectedConditions.elementToBeClickable(location));
        location.click();
        //driver.findElement(locationFrankfurt).click();
        logger.info("Location of data center was selected");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage setCommittedUsage() {
        driver.findElement(committedUsage).click();
        driver.findElement(usageOneYear).click();
        logger.info("Committed usage was set");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage pushEstimateButton() {
        //PageFactory.initElements(driver, addToEstimateButton);
        driver.findElement(addToEstimateButton).click();
        logger.info("New Estimate created");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage openMinuteMailHomePageAndGettingMail() {
        String calculatorWindow = driver.getWindowHandle();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://10minemail.com/ru/");
        driver.findElement(copyCreatedMailButton).click();
        driver.switchTo().window(calculatorWindow);
        logger.info("New mail was generated");
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage pasteCreatedMailForGettingCalculatedPrice() {
        WebElement element = driver.findElement(iframeGoogle);
        driver.switchTo().frame(element);
        driver.switchTo().frame("myFrame");
        driver.findElement(emailEstimateButton).click();
        WebElement fieldForEmail = driver.findElement(forPasteMailField);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(fieldForEmail));
        wait.until(ExpectedConditions.elementToBeClickable(fieldForEmail));
        fieldForEmail.click();
        Actions actionProvider = new Actions(driver);
        Action keyDown = actionProvider.keyDown(Keys.COMMAND).sendKeys("v").build();
        keyDown.perform();
        //PageFactory.initElements(driver, sendMailButton);
        logger.info("New mail was pasted into mail field");
        driver.findElement(sendMailButton).click();
        return new CloudCalculatorPage(driver);
    }

    public CloudCalculatorPage readMail() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(inboxPreviewMail));
        element.click();
        ArrayList<String> tabsNew = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabsNew.get(2));
        js.executeScript("window.scrollBy(0,1000)");
        logger.info("Mail with price was gotten and read");
        return new CloudCalculatorPage(driver);
    }
    public String getCalculatedPrices() {
        String exist = driver.findElement(countFromMail).getText();
        //String isExist = CharMatcher.inRange('0','9').retainFrom(exist);
        return exist;
    }
}
