package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainContributorTest extends TestBase {
    @Test
    void solntsevShouldBeMainContributor(){

//        открыть страницу репозитория selenide
        open("/selenide/selenide");

//        подвести мышку к первому элементу в области Contributors
        $(".Layout-sidebar").$(byText("Contributors"))
                .closest(".BorderGrid-row").$("ul li").hover();

//        check: в появившемся окошке текст Andrei Solntsev
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));

    }
}
