package by.belavia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final String URL = "https://belavia.by/";
    private final String LINK_PERSONAL_ACCOUNT_XPATH = "//a[@id='ffp-account']";
    private final String INPUT_LOGIN_XPATH = "//input[@name='login']";
    private final String TITLE_PERSONAL_ACCOUNT_FORM_XPATH = "//div[@class='title-2IBhr']";
    private final String TEXT_PERSONAL_ACCOUNT_FORM_XPATH = "//div[@class='text-3uUxD']";
    private final String CONTINUE_BUTTON_XPATH = "//button[@class='MuiButtonBase-root button-2bpkC root-7W-0m']";
    private final String ERROR_LOGIN_INVALID_DATA_XPATH = "//p[@class='MuiFormHelperText-root MuiFormHelperText-contained Mui-error hint-2b0fP MuiFormHelperText-filled']";
    private final String ERROR_HINT_EMPTY_EMAIL_XPATH = "//p[@class='MuiFormHelperText-root MuiFormHelperText-contained Mui-error hint-2b0fP']";
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkAccount() {
        driver.findElement(By.xpath(LINK_PERSONAL_ACCOUNT_XPATH)).click();
    }

    public String getTitlePersonalAccountForm() {
        return driver.findElement(By.xpath(TITLE_PERSONAL_ACCOUNT_FORM_XPATH)).getText();
    }

    public String getPersonalAccountForm() {
        return driver.findElement(By.xpath(TEXT_PERSONAL_ACCOUNT_FORM_XPATH)).getText();
    }

    public void openSite() {
        driver.get(URL);
    }

    public void clickContinueButton() {
        driver.findElement(By.xpath(CONTINUE_BUTTON_XPATH)).click();
    }

    public String getErrorHintEmptyEmailText() {
        return driver.findElement(By.xpath(ERROR_HINT_EMPTY_EMAIL_XPATH)).getText();
    }

    public String getErrorLoginInvalidData() {
        return driver.findElement(By.xpath(ERROR_LOGIN_INVALID_DATA_XPATH)).getText();
    }

    public void sendTextInputField(String text) {
        driver.findElement(By.xpath(INPUT_LOGIN_XPATH)).sendKeys(text);
    }
}

