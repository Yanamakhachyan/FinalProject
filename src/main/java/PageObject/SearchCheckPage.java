package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class SearchCheckPage {

    public SelenideElement

            searchInput = $(byId("search_list")),
            productFirm = $(".custom-control-label",3),
            minInput = $(byId("min"), 0),
            maxInput = $(byId("max"), 0);


}
