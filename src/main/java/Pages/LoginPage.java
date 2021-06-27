package Pages;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(name = "email")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String userName, String passWord) {
        username.clear();
        username.sendKeys(userName);
        password.clear();
        password.sendKeys(passWord);
        loginButton.click();
    }
}
