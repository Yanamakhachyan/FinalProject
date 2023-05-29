import StepObject.RegistrationPageSteps;
import Utils.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.RegistationPageData.*;

public class RegistrationPom extends ChromeRunner{
    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();
    @Test
    public void RegistrationCheck(){

        registrationPageSteps.GotoRegPage()
                .FilName(firstName)
                .FilLastName(lastName)
                .FilEmail(email)
                .FilPas(password)
                .FilConfPas(confirmPassword);
        Assert.assertTrue(registrationPageSteps.singUpBut.isDisplayed());



    }

}