package StepObject;


import PageObject.FiltrTestPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class FiltrTestSteps extends FiltrTestPage {
    @Step("chooses a section of technology")
    public FiltrTestSteps ChooseSec() {

        tecnika.shouldBe(visible);
        tecnika.hover();
        return this;
    }
    @Step("chooses a product")
    public FiltrTestSteps ChoosePlans() {

        choosePlans.shouldBe(visible);
        choosePlans.click();
        return this;
    }
    @Step("selects a price range")
    public FiltrTestSteps FilterBox() {

        filterBox.shouldBe(visible);
        filterBox.click();
        return this;
    }
    @Step("checks whether prices match the selected range")
    public FiltrTestSteps Circle(){

        ElementsCollection prices = $$(".real-price");

        for (SelenideElement priceElement : prices) {
            String textPrice = priceElement.getText();

            float price = Float.parseFloat(textPrice);

            SoftAssert softAssert = new SoftAssert();

            softAssert.assertTrue(price <= 1000, "Price value exceeded 1000: " + price);
            softAssert.assertTrue(price >= 750, "Price value lower than 750: " + price);

            softAssert.assertAll();

        }
        return this;
    }
}