package org.example;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.switchTo;

public class GoogleSearchTest extends BaseClass{

    @Test
    public void userCanSearch() {

        switchTo().frame(0);
        searchPage.acceptCookies();
        searchPage.setSearchField("selenide");
        searchPage.getSearchResults();
        //searchPage.clickSearchResult();

       // $(By.name("q")).setValue("Selenide").pressEnter();
        //$$("#ires li.g").shouldHave(CollectionCondition.size(10));
        //$("#ires li.g").shouldHave(text("Selenide: concise UI Tests in Java"));
    }
}
