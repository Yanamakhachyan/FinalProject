import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.sleep;

public class Elit1   extends ChromeRunner {
    @Test
    public void registerproject() {
        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        String value1 = "Lilu";
        SelenideElement nameinput = $(byId("firstName"));
        nameinput.setValue(value1);
        Assert.assertFalse(value1.isEmpty());
        sleep(3000);

        String value3 = "liludalas@mail.ru";
        SelenideElement emailinput = $(byId("email"));
        emailinput.setValue(value3);
        Assert.assertFalse(value3.isEmpty());
        sleep(3000);
    }
    @Test
            public void registerproject1 () {

        SoftAssert softAssert = new SoftAssert();
        String value2 = "Dalas";
        SelenideElement lastnameinput = $(byId("lastName"));
        lastnameinput.setValue(value2);
        softAssert.assertEquals(lastnameinput.getValue(), "Dalas");
        sleep(5000);

        softAssert.assertAll();

    }

}
