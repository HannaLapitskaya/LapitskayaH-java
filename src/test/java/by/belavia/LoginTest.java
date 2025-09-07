package by.belavia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Checking the text on the form")
    public void test1() {
        Assertions.assertEquals("Вход", loginPage.getTitlePersonalAccountForm());
        Assertions.assertEquals("Если у вас нет аккаунта — он создастся автоматически", loginPage.getPersonalAccountForm());
    }

    @Test
    @DisplayName("Validation check for an empty field")
    public void test2() {
        loginPage.clickContinueButton();

        Assertions.assertEquals("Обязательное поле", loginPage.getErrorHintEmptyEmailText());
    }

    @Test
    @DisplayName("Login with incorrect data")
    public void test3() {
        loginPage.sendTextInputField("1");
        loginPage.clickContinueButton();

        Assertions.assertEquals("Пожалуйста, введите Эл. почту / Номер карты", loginPage.getErrorLoginInvalidData());
    }
}
