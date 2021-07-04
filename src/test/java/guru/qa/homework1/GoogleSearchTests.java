package guru.qa.homework1;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchTests {

    @Test
    void selenideSearchTest() {
        // open https://google.com
        open("https://google.com");

        // type search "selenide"
        $("[name=q]").setValue("selenide").pressEnter();

        // check selenide.org in test results
        $("#search").shouldHave(text("selenide.org"));
    }
}
