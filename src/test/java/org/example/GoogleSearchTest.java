package org.example;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.switchTo;

public class GoogleSearchTest extends BaseClass{

    @Test
    public void userCanSearch()   {

        switchTo().frame(0);
        searchPage.acceptCookies();
        searchPage.setSearchField("купить кофемашину bork c804");
        searchPage.checkNumPage();
        searchPage.checkSearchResult();

    }
}
