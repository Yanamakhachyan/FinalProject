package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static DataObject.RegistationPageData.firstName;

public class RegistrationPageSteps extends RegistrationPage {
    @Step("opens registration page")
    public RegistrationPageSteps GotoRegPage() {
        regBut.click();
        regPageText.should(Condition.visible);
        return this;
    }
    @Step("fills name field")
    public RegistrationPageSteps FilName(String name) {
        inputName.setValue(name);
        inputName.shouldNot(Condition.empty);
        return this;
    }
    @Step("fills in the lastname field")
    public RegistrationPageSteps FilLastName(String lastname) {
        inputLastName.setValue(lastname);
        inputLastName.shouldBe(Condition.visible);
        return this;
    }
    @Step("Fils email field")
    public RegistrationPageSteps FilEmail(String email) {
        inputEmail.setValue(email);
        inputEmail.shouldNot(Condition.disappear);
        return this;
    }
    @Step("Fils password field")
    public RegistrationPageSteps FilPas(String pas) {
        inputPassword.setValue(pas);
        inputPassword.shouldNot(Condition.disappear);
        return this;
    }
    @Step("Fils confirm password field")
    public RegistrationPageSteps FilConfPas(String confPas) {
        inputConfirmPassword.setValue(confPas);
        inputConfirmPassword.shouldNot(Condition.disappear);
        return this;
    }


}