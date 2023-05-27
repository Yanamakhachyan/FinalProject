package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    public SelenideElement

    regBut =  $(byText("რეგისტრაცია")),
    regPageText =  $(byText("სწრაფი რეგისტრაცია")),
            inputname = $(byId("firstName")),
    inputlastname = $(byId("lastName")),
    inputemail = $(byId("email"));








}
