package tests.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FindContributors {

    @Test
    void findContributorShouldBeSolntsev() {
        // open https://github.com project selenide
        open("https://github.com/selenide/selenide");

        // find block Contributors and open overlay of the first element
        $(".BorderGrid").$(byText("Contributors"))
                .closest("div").$("li").hover();

        // assert - Andrei Solntsev is in overlay
        $$(".Popover-message").findBy(visible)
                .shouldHave(text("Andrei Solntsev"));
    }
}
