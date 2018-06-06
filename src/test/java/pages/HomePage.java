package pages;

import components.LoginComponent;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 06.06.18.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        login("john", "demo");
    }

    public void login(String username, String password) {
        new LoginComponent(webdriver).login(username, password);
    }
}
