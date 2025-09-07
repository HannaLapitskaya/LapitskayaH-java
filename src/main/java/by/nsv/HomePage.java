package by.nsv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final String URL = "https://nsv.by/";
    private final String ACCEPT_COOKIE_ID = "paloma_cookie-accept";
    private final String PERSONAL_LINK_XPATH = "//div[@class ='wrap_icon inner-table-block']/a[@data-name = 'auth']";
    private final String CALL_HEADER_ID = "ClickCallHeader1";
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSite() {
        driver.get(URL);
    }

    public void clickAcceptCookieButton() {
        driver.findElement(By.id(ACCEPT_COOKIE_ID)).click();
    }

    public void clickPersonalLinkButton() {
        driver.findElement(By.xpath(PERSONAL_LINK_XPATH)).click();
    }

    public String getCallHeaderText() {
        return driver.findElement(By.id(CALL_HEADER_ID)).getText();
    }
}
