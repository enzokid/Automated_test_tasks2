package org.example;


import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.collections.SizeGreaterThanOrEqual;
import org.openqa.selenium.By;

import java.nio.file.LinkOption;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchPage {

    private SelenideElement searchField = $(By.name("q"));
    private SelenideElement acceptCookies = $("#introAgreeButton span.RveJvd.snByac");
    private SelenideElement numPage = $("span#xjs");

    private SelenideElement searchResult =$(By.xpath("//*[contains(text(),'www.mvideo.ru')]"));
    private ElementsCollection searchResults = $$("#res div.g");

    public void acceptCookies() {
        acceptCookies.click();
    }


    public void setSearchField(String key) {
        searchField.val(key);
        searchField.pressEnter();
    }

    public void checkNumPage() {
        numPage.shouldBe(visible);
    }

    public void checkSearchResult() {
        searchResult.shouldBe(visible);
    }

}