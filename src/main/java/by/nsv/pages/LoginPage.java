package by.nsv.pages;

import by.nsv.singleton.WebDriverSingleton;

public class LoginPage {
    public final String HEAD_FORM_TITLE = "//div[@class ='form_head']/h2";
    private final String LOGIN_POPUP = "//input[@id='USER_LOGIN_POPUP']";
    private final String PASSWORD_POPUP = "//input[@id='USER_PASSWORD_POPUP']";
    private final String LOGIN_BUTTON = "//button[@name='Login']";
    private final String LOGIN_POPUP_ERROR = "//label[@id='USER_LOGIN_POPUP-error']";
    private final String PASSWORD_POPUP_ERROR = "//label[@id='USER_PASSWORD_POPUP-error']";
    private final String ALERT_DANGER = "//div[@class='alert alert-danger']";
    private final String FORGOT_PULL_RIGHT = "//a[@class='forgot pull-right']";
    private final String PERSONAL_LINK = "//div[@class ='wrap_icon inner-table-block']/a[@data-name = 'auth']";

    public LoginPage() {
    }

    public void clickPersonalLinkButton() {
        WebDriverSingleton.clickElement(PERSONAL_LINK);
    }

    public String getHeadTitleText() {
        return WebDriverSingleton.getTextFromElement(HEAD_FORM_TITLE);
    }

    public void sendKeysLogin(String login) {
        WebDriverSingleton.sendKeys(LOGIN_POPUP, login);
    }

    public void sendKeysPassword(String password) {
        WebDriverSingleton.sendKeys(PASSWORD_POPUP, password);
    }

    public void clickLoginButton() {
        WebDriverSingleton.clickElement(LOGIN_BUTTON);
    }

    public String getLoginPopupErrorText() {
        return WebDriverSingleton.getTextFromElement(LOGIN_POPUP_ERROR);
    }

    public String getPasswordPopupErrorText() {
        return WebDriverSingleton.getTextFromElement(PASSWORD_POPUP_ERROR);
    }

    public String getAlertDangerText() {
        return WebDriverSingleton.getTextFromElement(ALERT_DANGER);
    }

    public String getForgotPullRightText() {
        return WebDriverSingleton.getTextFromElement(FORGOT_PULL_RIGHT);
    }

    public void fillLoginForm(String login, String password) {
        sendKeysLogin(login);
        sendKeysPassword(password);
        clickLoginButton();
    }
}
