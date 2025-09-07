package by.nsv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeEach
    public void openHomePageClickCookieButton() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        homePage.openSite();
        homePage.clickAcceptCookieButton();
        homePage.clickPersonalLinkButton();
    }

    @Test
    @DisplayName("Presence of the 'Личный кабинет' header")
    public void test1() {
        Assertions.assertEquals("Личный кабинет", loginPage.getHeadTitleText());
    }

    @Test
    @DisplayName("Presence of 'Заполните это поле' hint when two fields are empty")
    public void test2() {
        loginPage.clickLoginButton();

        Assertions.assertEquals("Заполните это поле", loginPage.getLoginPopupErrorText());
        Assertions.assertEquals("Заполните это поле", loginPage.getPasswordPopupErrorText());
    }

    @Test
    @DisplayName("Presence of 'Заполните это поле' hint if filled in only Login input")
    public void test3() {
        loginPage.sendKeysLogin("TestData");
        loginPage.clickLoginButton();

        Assertions.assertEquals("Заполните это поле", loginPage.getPasswordPopupErrorText());
    }

    @Test
    @DisplayName("Presence of 'Заполните это поле' hint if filled in only 'Password' input")
    public void test4() {
        loginPage.sendKeysPassword("123456");
        loginPage.clickLoginButton();

        Assertions.assertEquals("Заполните это поле", loginPage.getLoginPopupErrorText());
    }

    @Test
    @DisplayName("Validation of the minimum limit of the 'Password' input(< 6 symbols)")
    public void test5() {
        loginPage.fillLoginForm("TestUser", "12345");

        Assertions.assertEquals("Минимум 6 символов", loginPage.getPasswordPopupErrorText());
    }

    @Test
    @DisplayName("Login with invalid data")
    public void test6() {
        loginPage.fillLoginForm("TestUser", "123456");

        Assertions.assertEquals("Неверный логин или пароль", loginPage.getAlertDangerText().trim());
    }

    @Test
    @DisplayName("Presence of the 'Забыли пароль?' text")
    public void test7() {
        Assertions.assertEquals("Забыли пароль?", loginPage.getForgotPullRightText());
    }
}
