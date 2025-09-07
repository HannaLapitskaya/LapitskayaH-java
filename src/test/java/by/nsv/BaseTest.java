package by.nsv;

import by.nsv.pages.HomePage;
import by.nsv.singleton.WebDriverSingleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected HomePage homePage;

    @BeforeEach
    public void setups(){
        homePage = new HomePage();
        homePage.openSite();
        homePage.clickAcceptCookieButton();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSingleton.quit();
    }
}
