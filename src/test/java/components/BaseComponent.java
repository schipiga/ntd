package components;

import org.openqa.selenium.WebDriver;

/**
 * Created by user on 06.06.18.
 */
public class BaseComponent {

    protected WebDriver webdriver;

    public BaseComponent(WebDriver driver) {
        webdriver = driver;
    }
}
