import Pages.LoginPage;
import commons.DataProviderClass;
import commons.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static commons.Configuration.url;

public class FirstTest extends TestBase {

    @BeforeMethod
    public void preHook() {
        driver.get(url.asString());
    }

    @Test(dataProvider = "excel-data", dataProviderClass = DataProviderClass.class)
    public void firstTest(String email, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(email, password);
    }
}
