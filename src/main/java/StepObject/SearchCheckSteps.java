package StepObject;

import PageObject.SearchCheckPage;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

public class SearchCheckSteps extends SearchCheckPage {
    @Step("looking for a tablet")
    public SearchCheckSteps SetProduct() {
        searchInput.setValue("პლანშეტები");
        searchInput.pressEnter();
        return this;
    }
    @Step("selects a manufacturer")
    public SearchCheckSteps ChooseFirm() {
        productFirm.click();
        return this;
    }
    @Step("sets min price")
    public SearchCheckSteps SetMin() {
        minInput.sendKeys(Keys.BACK_SPACE);
        minInput.setValue("100");
        return this;
    }
    @Step("sets max price")
    public SearchCheckSteps SetMax() {
        maxInput.click();
        maxInput.setValue("5000");
        return this;
    }
}