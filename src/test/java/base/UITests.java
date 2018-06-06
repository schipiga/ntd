package base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import utils.Links;

/**
 * Created by user on 06.06.18.
 */
public class UITests {

    private static WebDriver driver;
    protected static HomePage homepage;

    @BeforeClass
    public static void launchApplication() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        driver = new ChromeDriver();

        driver.get(Links.HOME);

        homepage = new HomePage(driver);
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }

    @Test
    public void testSetUp() {
        login();
    }

    public static void login() {
        login("john", "demo");
    }

    public static void login(String username, String password) {
        homepage.login(username, password);
    }
}
