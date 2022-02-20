package tests;


import org.junit.jupiter.api.Test;
import pages.CheckJUnit5Page;


public class CheckJUnit5Test extends TestBase {
    CheckJUnit5Page checkJUnit5Page = new CheckJUnit5Page();

    String pageName = "SoftAssertions";
    String checkValue = "Using JUnit5 extend test class:";

    @Test
    void findJUnit5Code() {
        checkJUnit5Page.openRepoPage()              // Окрыть страницу репозитория selenide
                .openWiki()                         // Перейти в раздел Wiki
                .setPageName(pageName)              // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
                .openSoftAssertions()               // Откройте страницу SoftAssertion
                .checkJUnit5(checkValue);           // Проверьте что внутри есть пример кода для JUnit5
    }
}
