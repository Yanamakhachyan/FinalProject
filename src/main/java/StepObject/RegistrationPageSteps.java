package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;

public class RegistrationPageSteps extends RegistrationPage {

    public RegistrationPageSteps GotoRegPage() {
        regBut.click();
        regPageText.should(Condition.visible);

        return this;
    }


}