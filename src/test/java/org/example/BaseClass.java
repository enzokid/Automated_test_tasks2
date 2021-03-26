package org.example;

import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class BaseClass {

    protected SearchPage searchPage = new SearchPage();

    @Before
    public void setUp() {

        fastSetValue = false;
        pageLoadStrategy = "eager";
        startMaximized = true;
        clearBrowserCookies();
        open("https://google.com/");

    }

    @After
    public void tearDown() {
        closeWebDriver();
    }
}
