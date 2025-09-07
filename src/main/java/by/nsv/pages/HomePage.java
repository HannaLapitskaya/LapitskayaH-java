package by.nsv.pages;

import by.nsv.singleton.WebDriverSingleton;

public class HomePage {
    private final String URL = "https://nsv.by/";
    private final String ACCEPT_COOKIE_XPATH = "//a[@id ='paloma_cookie-accept']";
    private final String CALL_HEADER_XPATH = "//a[@id='ClickCallHeader1']";

    public HomePage() {
    }

    public void openSite() {
        WebDriverSingleton.getDriver().get(URL);
    }

    public void clickAcceptCookieButton() {
        WebDriverSingleton.clickElement(ACCEPT_COOKIE_XPATH);
    }

    public String getCallHeaderText() {
        return WebDriverSingleton.getTextFromElement(CALL_HEADER_XPATH);
    }
}
