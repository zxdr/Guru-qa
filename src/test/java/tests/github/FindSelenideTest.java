package tests.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FindSelenideTest {

    @Test
    void findSelenideTest() {
        // open https://github.com
        open("https://github.com");

        // type search "selenide" and click enter
        $("[name=q]").setValue("selenide").pressEnter();

        // check and click the first element in test results list
        $$("ul.repo-list li a").first().click();

        // assert - selenide / selenide is in a header
        $("h1").shouldHave(text("selenide / selenide"));
    }
}
