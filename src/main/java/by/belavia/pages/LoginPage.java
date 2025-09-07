package by.belavia.pages;

import by.belavia.singleton.WebDriverSingleton;

public class LoginPage {
    private final String URL = "https://belavia.by/";
    private final String LINK_PERSONAL_ACCOUNT = "//a[@id='ffp-account']";
    private final String INPUT_LOGIN = "//input[@name='login']";
    private final String TITLE_PERSONAL_ACCOUNT_FORM = "//div[@class='title-2IBhr']";
    private final String TEXT_PERSONAL_ACCOUNT_FORM = "//div[@class='text-3uUxD']";
    private final String CONTINUE_BUTTON = "//button[@class='MuiButtonBase-root button-2bpkC root-7W-0m']";
    private final String ERROR_LOGIN_INVALID_DATA = "//p[@class='MuiFormHelperText-root MuiFormHelperText-contained Mui-error hint-2b0fP MuiFormHelperText-filled']";
    private final String ERROR_HINT_EMPTY_EMAIL = "//p[@class='MuiFormHelperText-root MuiFormHelperText-contained Mui-error hint-2b0fP']";

    public LoginPage() {
    }

    public void clickLinkAccount() {
        WebDriverSingleton.clickElement(LINK_PERSONAL_ACCOUNT);
    }

    public String getTitlePersonalAccountForm() {
        return WebDriverSingleton.getTextFromElement(TITLE_PERSONAL_ACCOUNT_FORM);
    }

    public String getPersonalAccountForm() {
        return WebDriverSingleton.getTextFromElement(TEXT_PERSONAL_ACCOUNT_FORM);
    }

    public void openSite() {
        WebDriverSingleton.getDriver().get(URL);
    }

    public void clickContinueButton() {
        WebDriverSingleton.clickElement(CONTINUE_BUTTON);
    }

    public String getErrorHintEmptyEmailText() {
        return WebDriverSingleton.getTextFromElement(ERROR_HINT_EMPTY_EMAIL);
    }

    public String getErrorLoginInvalidData() {
        return WebDriverSingleton.getTextFromElement(ERROR_LOGIN_INVALID_DATA);
    }

    public void sendTextInputField(String text) {
        WebDriverSingleton.sendKeys(INPUT_LOGIN, text);
    }
}

