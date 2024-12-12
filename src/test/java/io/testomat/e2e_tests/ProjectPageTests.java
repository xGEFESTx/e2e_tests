package io.testomat.e2e_tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ProjectPageTests {

    @Test
    public void loginTest(){
        open("https://app.testomat.io/");
        $("#content-desktop #user_email").setValue("sh.genka@gmail.com");
        $("#content-desktop #user_password").setValue("pfiyndVjN8f3!LF");
        $("#content-desktop #user_remember_me").click();
        $("#content-desktop [name=\"commit\"]").click();
        $(".common-flash-success").shouldBe(Condition.visible);

        $("#search").setValue("Manufacture light");

        $(byText("Manufacture light")).click();
        sleep(10000);
        $("h2").shouldHave(Condition.text("Manufacture light"));


    }
}
