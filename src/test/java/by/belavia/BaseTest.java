package by.belavia;

import by.belavia.pages.LoginPage;
import by.belavia.singleton.WebDriverSingleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected LoginPage loginPage;

    @BeforeEach
    public void setup() {
        loginPage = new LoginPage();
        loginPage.openSite();
        loginPage.clickLinkAccount();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSingleton.quit();
    }
}
