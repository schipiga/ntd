package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by user on 06.06.18.
 */
public class BasePage {

    protected WebDriver webdriver;

    public BasePage(WebDriver driver) {
        webdriver = driver;
    }
}
