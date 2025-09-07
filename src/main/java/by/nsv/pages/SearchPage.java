package by.nsv.pages;

import by.nsv.singleton.WebDriverSingleton;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class SearchPage {
    private final String INPUT_SEARCH = "//input[@id='title-search-input_fixed']";
    private final String BUTTON_SUBSEARCH = "//div[@id='title-search_fixed']//button[@id='subserch']";
    private final String SEARCH_RESULTS = "//div[@class='item-title']";
    private final String SEARCH_RESULT_NOT_FOUND = "//div[@class ='middle']";

    public SearchPage() {
    }

    public void openSearchInput() {
        WebDriverSingleton.clickElement(INPUT_SEARCH);
    }

    public void sendKeysSearch(String search) {
        WebDriverSingleton.sendKeys(INPUT_SEARCH, search);
    }

    public void startSearch() {
        WebDriverSingleton.clickElement(BUTTON_SUBSEARCH);
    }

    public String getInputSearchText(){
        return WebDriverSingleton.getAttributeFromElement(INPUT_SEARCH, "placeholder");
    }

    public String getSearchResultNotFoundText() {
        return WebDriverSingleton.getTextFromElement(SEARCH_RESULT_NOT_FOUND).trim();
    }

    public List<String> getSearchResultItemsTitleText() {
        return WebDriverSingleton.findElements(SEARCH_RESULTS).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public String getSearchResultFirstItemTitleText() {
        return getSearchResultItemsTitleText().getFirst();
    }
}
