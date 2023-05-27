import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Elit3 extends ChromeRunner {
    @Test
    public void filtrplanshet() {

        $(byLinkText("კომპიუტერული ტექნიკა")).shouldBe(Condition.visible).hover();
        sleep(2000);
        $(byLinkText("პლანშეტი")).shouldBe(Condition.visible).click();


        sleep(2000);
        $(".under-price.filter_box").find(byText("750₾ - 1000₾")).click();

        sleep(2000);

        ElementsCollection prices = $$(".real-price");

        for (SelenideElement priceElement : prices) {
            String textPrice = priceElement.getText();

            float price = Float.parseFloat(textPrice);

            Assert.assertTrue(price <= 1000, "Price value exceeded 1000: " + price);
            Assert.assertTrue(price >= 750, "Price value lower then 750: " + price);
        }

    }

    @Test
    public void filtrplanshet1() {

        $("input#APPLE").scrollTo();
        $("input#APPLE").parent().click();

        sleep(2000);

        ElementsCollection titles = $$("h2.txt-grey>span.title");

        for (SelenideElement titleEl : titles) {
            String titleText = titleEl.getText().trim();
            if (titleText.length() == 0) continue;
            Assert.assertTrue(titleText.toLowerCase().contains("apple"), "Product of not requested brand: " + titleText);
        }


    }
}
