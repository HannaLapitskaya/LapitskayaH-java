package by.nsv.pages;

import by.nsv.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public final String HEAD_FORM_TITLE_XPATH = "//div[@class ='form_head']/h2";
    private final String LOGIN_POPUP_ID = "USER_LOGIN_POPUP";
    private final String PASSWORD_POPUP_ID = "USER_PASSWORD_POPUP";
    private final String LOGIN_BUTTON_Name = "Login";
    private final String LOGIN_POPUP_ERROR_ID = "USER_LOGIN_POPUP-error";
    private final String PASSWORD_POPUP_ERROR_ID = "USER_PASSWORD_POPUP-error";
    private final String ALERT_DANGER_XPATH = "//div[@class='alert alert-danger']";
    private final String FORGOT_PULL_RIGHT_XPATH = "//a[@class='forgot pull-right']";

    private WebDriver driver;

    public LoginPage() {
        this.driver = Singleton.getDriver();
    }

    public String getHeadTitleText() {
        return driver.findElement(By.xpath(HEAD_FORM_TITLE_XPATH)).getText();
    }

    public void sendKeysLogin(String login) {
        driver.findElement(By.id(LOGIN_POPUP_ID)).sendKeys(login);
    }

    public void sendKeysPassword(String password) {
        driver.findElement(By.id(PASSWORD_POPUP_ID)).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.name(LOGIN_BUTTON_Name)).click();
    }

    public String getLoginPopupErrorText() {
        return driver.findElement(By.id(LOGIN_POPUP_ERROR_ID)).getText();
    }

    public String getPasswordPopupErrorText() {
        return driver.findElement(By.id(PASSWORD_POPUP_ERROR_ID)).getText();
    }

    public String getAlertDangerText() {
        return driver.findElement(By.xpath(ALERT_DANGER_XPATH)).getText();
    }

    public String getForgotPullRightText() {
        return driver.findElement(By.xpath(FORGOT_PULL_RIGHT_XPATH)).getText();
    }

    public void fillLoginForm(String login, String password) {
        sendKeysLogin(login);
        sendKeysPassword(password);
        clickLoginButton();
    }
}
