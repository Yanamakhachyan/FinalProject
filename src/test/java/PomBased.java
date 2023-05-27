import StepObject.RegistrationPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

public class PomBased extends ChromeRunner{
    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();
    @Test
    public void RegistrationCheck(){

         registrationPageSteps.GotoRegPage() ;





    }
}