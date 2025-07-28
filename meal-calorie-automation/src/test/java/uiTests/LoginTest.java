package uiTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initDriver();
        driver.get("http://localhost:3000/login");
    }

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("john@example.com", "secure123");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }

}
