package org.example;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenideTargetLocator;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchPage {

    private SelenideElement searchField = $(By.name("q"));
    private SelenideElement searchResult =  $("#res div.g");
    private ElementsCollection searchResults = $$("#res div.g");
    private SelenideElement acceptCookies = $("#introAgreeButton span.RveJvd.snByac");


    public void acceptCookies() {
        acceptCookies.click();
    }


    public void setSearchField(String key) {
        searchField.val(key);
        searchField.pressEnter();
    }

    public void getSearchResults(){
        searchResults.shouldHave(CollectionCondition.sizeGreaterThanOrEqual(1)).filterBy(text("Selenide: concise UI Tests in Java")).first().click();

    }

    public void clickSearchResult(){
        searchResult.click();
    }

}