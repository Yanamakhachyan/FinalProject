import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class Elit2  extends ChromeRunner {
    @Test
    public void searchproject() {

        $(byId("search_list")).setValue("Alisa").pressEnter();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        $(byText("ფასის შუალედი")).should(Condition.visible);

        String searchvalue = "პლანშეტები";
        SelenideElement searchinput = $(byId("search_list"));
        searchinput.setValue(searchvalue);
        Assert.assertEquals(searchinput.getValue(), searchvalue);
        sleep(4000);
    }

    @Test
    public void searchproject1() {

        $(byId("search_list")).setValue("პლანშეტები").pressEnter();
        $(byId("ALLDOCUBE")).doubleClick();
        sleep(3000);
        $(byId("min"), 0).sendKeys(Keys.BACK_SPACE);
        $(byId("min"), 0).setValue("100");

        $(byId("max"), 0).click();
        $(byId("max"), 0).setValue("5000");
        sleep(5000);


    }
}