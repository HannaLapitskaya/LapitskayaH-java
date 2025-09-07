package by.nsv;

import by.nsv.pages.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SearchTest extends BaseTest {
    private SearchPage searchPage;

    @BeforeEach
    public void openSearchPage() {
        searchPage = new SearchPage();
        searchPage.openSearchInput();
    }

    @Test
    @DisplayName("Presence of the 'Поиск товара' placeholder")
    public void test1() {
        Assertions.assertEquals("Поиск товара", searchPage.getInputSearchText());
    }

    @Test
    @DisplayName("Presence of the 'Сожалеем, но ничего не найдено.' if nothing was found")
    public void test2() {
        searchPage.sendKeysSearch("Виолончель");
        searchPage.startSearch();
        Assertions.assertEquals("Сожалеем, но ничего не найдено.", searchPage.getSearchResultNotFoundText());
    }

    @Test
    @DisplayName("Matching the title of the first list item - first method")
    public void test3() {
        searchPage.sendKeysSearch("Iphone");
        searchPage.startSearch();
        List<String> results = searchPage.getSearchResultItemsTitleText();

        Assertions.assertEquals("Телефон Apple iPhone 16e 128GB (белый)", results.getFirst());
    }

    @Test
    @DisplayName("Matching the title of the first list item - second method")
    public void test4() {
        searchPage.sendKeysSearch("Iphone");
        searchPage.startSearch();

        Assertions.assertEquals("Телефон Apple iPhone 16e 128GB (белый)", searchPage.getSearchResultFirstItemTitleText());
    }

    @Test
    @DisplayName("All search results contain the text 'принтер'")
    public void test5() {
        searchPage.sendKeysSearch("принтер");
        searchPage.startSearch();
        List<String> results = searchPage.getSearchResultItemsTitleText();

        Assertions.assertTrue(results.stream().allMatch(title -> title.toLowerCase().contains("принтер")));
    }
}
