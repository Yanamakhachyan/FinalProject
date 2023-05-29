import StepObject.FiltrTestSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

public class FilteringPom extends ChromeRunner {



    FiltrTestSteps filtrTestSteps = new FiltrTestSteps();
    @Test
    public void FiltrElit(){

        filtrTestSteps.ChooseSec()
                .ChoosePlans()
                .FilterBox()
                .Circle();

    }




}
