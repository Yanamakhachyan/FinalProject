package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FiltrTestPage {

    public SelenideElement

    tecnika =  $(byLinkText("კომპიუტერული ტექნიკა")),
    choosePlans = $(byLinkText("პლანშეტი")),
    filterBox =  $(".under-price.filter_box").find(byText("750₾ - 1000₾"));



}
