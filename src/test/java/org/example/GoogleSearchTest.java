package org.example;

import org.junit.Test;

public class GoogleSearchTest extends BaseClass{

    @Test
    public void userCanSearch() {

        searchPage.acceptCookies();
        searchPage.setSearchField("Selenide");
        searchPage.getSearchResults();
        searchPage.clickSearchResult();

       // $(By.name("q")).setValue("Selenide").pressEnter();
        //$$("#ires li.g").shouldHave(CollectionCondition.size(10));
        //$("#ires li.g").shouldHave(text("Selenide: concise UI Tests in Java"));
    }
}
