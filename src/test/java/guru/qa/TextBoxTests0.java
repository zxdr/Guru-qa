package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests0 {

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
//    void successfulSubmitFormTest() {
//        open("https://demoqa.com/automation-practice-form");
//
//        $("#firstName").setValue("test name");
//        $("#lastName").setValue("test last name");
//        $("#userEmail").setValue("someemail@mail.ma");
//        $("[//label[@for=\"gender-radio-1\"]]").click();
//        $("userNumber").setValue("9999999999");
//
//        $("[id=name]").shouldHave(text("Name:"), text("some user"));
//        $("[id=email]").shouldHave(text("Email:"), text("someemail@mail.ma"));
//        $("[id=currentAddress]", 1).shouldHave(
//                text("Current Address :"), text("some user address 74"));
//        $("p[id=permanentAddress]").shouldHave(
//                text("Permananet Address :"), text("some user no i dont have"));


//    @Test
//    void successfulSubmitFormWithVariablesTest() {
//        String userName = "some user";
//
//        open("https://demoqa.com/text-box");
//
//        $("[id=userName]").setValue(userName);
//        $("[id=userEmail]").setValue("someemail@mail.ma");
//        $("[id=currentAddress]").setValue("some user address 74");
//        $("[id=permanentAddress]").setValue("some user no i dont have");
//        $("[id=submit]").click();
//
//        $("[id=name]").shouldHave(text("Name:"), text(userName));
//        $("[id=email]").shouldHave(text("Email:"), text("someemail@mail.ma"));
//        $("[id=currentAddress]", 1).shouldHave(
//                text("Current Address :"), text("some user address 74"));
//        $("p[id=permanentAddress]").shouldHave(
//                text("Permananet Address :"), text("some user no i dont have"));
//    }

//    @Test
//    void successfulSubmitFormSearchInOutputTest() {
//        String userName = "some user";
//
//        open("https://demoqa.com/text-box");
//
//        $("[id=userName]").setValue(userName);
//        $("[id=userEmail]").setValue("someemail@mail.ma");
//        $("[id=currentAddress]").setValue("some user address 74");
//        $("[id=permanentAddress]").setValue("some user no i dont have");
//        $("[id=submit]").click();
//
//        $("[id=output]").shouldHave(text(userName), text("someemail@mail.ma"),
//                text("some user address 74"), text("some user no i dont have"));
//    }
//
//
//    @Test
//    void successfulSubmitFormWithBadLocatorsTest() {
//        String userName = "some user";
//
//        open("https://demoqa.com/text-box");
//
//        $("[id=userName]").setValue(userName);
//        $("[placeholder=\"name@example.com\"]").setValue("someemail@mail.ma");
//        $("textarea").setValue("some user address 74");
//        $(".form-control", 3).setValue("some user no i dont have");
//        $(byText("Submit")).click();
//
//        $("[id=output]").shouldHave(text(userName), text("someemail@mail.ma"),
//                text("some user address 74"), text("some user no i dont have"));
//    }


}