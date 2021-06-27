package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = createDriver();
        setWebDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    public WebDriver createDriver() {
        var driverPath = System.getProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", driverPath);
        return new ChromeDriver();
    }

    public void setWebDriver() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }
}
