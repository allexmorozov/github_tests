package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class JUnit5CheckTest extends TestBase {
    @Test
    void checkJUnit() {
        open("/selenide/selenide");                                        // Окрыть страницу репозитория selenide
        $("#wiki-tab").click();                                            // Перейти в раздел Wiki
        $(".js-wiki-more-pages-link").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));           // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(byText("SoftAssertions")).click();                               // Откройте страницу SoftAssertion
        $("body").shouldHave(text("Using JUnit5 extend test class:"));     // Проверьте что внутри есть пример кода для JUnit5
    }
}
