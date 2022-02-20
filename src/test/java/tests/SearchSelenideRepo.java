package tests;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {

    @Test
    void shouldFindSelenideInGithub() {
//        открыть github.com
        open("https://github.com/");
//        ввести в поле поиска selenide нажать enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
//        нажать на линк первого результата поиска
        $$(".repo-list li").first().$("a").click();
//        check: в заголовке встречается selenide/selenide
        $("h1").shouldHave(text("selenide / selenide"));
    }
}
