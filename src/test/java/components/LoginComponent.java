package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 06.06.18.
 */
public class LoginComponent extends BaseComponent {

    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector("input[type=submit]");

    public LoginComponent(WebDriver driver) {
        super(driver);
    }

    protected void setTextField(By el, String text) {
        webdriver.findElement(el).clear();
        webdriver.findElement(el).sendKeys(text);
    }

    public void setUsername(String username) {
        setTextField(usernameField, username);
    }

    public void setPassword(String passwd) {
        setTextField(passwordField, passwd);
    }

    public void clickLogin() {
        webdriver.findElement(loginButton).click();
    }

    public void login(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLogin();
    }
}
