package by.nsv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomeTest extends BaseTest {
    private HomePage homePage;

    @BeforeEach
    public void openHomePageClickCookieButton() {
        homePage = new HomePage(driver);
        homePage.openSite();
        homePage.clickAcceptCookieButton();
    }

    @Test
    @DisplayName("Presence of a phone number for communication in the header")
    public void test1() {
        Assertions.assertEquals("+375 29 303-03-03", homePage.getCallHeaderText());
    }
}
