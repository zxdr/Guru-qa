package guru.qa.additional;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBox {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }

    @Test
    void positiveFillTest() {
        open("/text-box");
        $("#userName").setValue("Dasha");
        $("#userEmail").setValue("Dasha@aaa.aa");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Moscow");
        $("#submit").click();

        $("#name").shouldHave(text("Dasha"));
        $("#email").shouldHave(text("Dasha@aaa.aa"));
        $("#currentAddress", 1).shouldHave(text("Moscow"));
        $("#permanentAddress", 1).shouldHave(text("Moscow"));
    }
}