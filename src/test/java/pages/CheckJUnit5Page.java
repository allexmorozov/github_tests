package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckJUnit5Page {
    private SelenideElement
            wikiPage = $("#wiki-tab"),
            pagesInput = $("#wiki-pages-filter"),
            softAssertionsName = $(byText("SoftAssertions")),
            softAssertionsContent = $("body");

    public CheckJUnit5Page openRepoPage() {
        open("/selenide/selenide");
        return this;
    }

    public CheckJUnit5Page openWiki() {
        wikiPage.click();
        return this;
    }

    public CheckJUnit5Page setPageName(String pageName) {
        pagesInput.setValue(pageName);
        return this;
    }

    public CheckJUnit5Page openSoftAssertions() {
        softAssertionsName.click();
        return this;
    }

    public CheckJUnit5Page checkJUnit5(String checkValue) {
        softAssertionsContent.shouldHave(text(checkValue));
        return this;
    }

}
