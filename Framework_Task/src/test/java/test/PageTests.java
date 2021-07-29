package test;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import page.CloudCalculatorPage;
import utill.TestListener;

import java.time.Duration;

@Listeners({TestListener.class})
public class PageTests {

    protected WebDriver driver;
    protected CloudCalculatorPage cloudCalculatorPage;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        driver = DriverSingleton.getDriver();
        cloudCalculatorPage = new CloudCalculatorPage(driver);
    }
//    public void setDriver(){
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        cloudCalculatorPage = new CloudCalculatorPage(driver);
//    }

    @AfterClass(alwaysRun = true)
    public void stopDriver(){
        DriverSingleton.closeDriver();
    }
}
