import StepObject.SearchCheckSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

public class SearchPom extends ChromeRunner {

    SearchCheckSteps searchCheckSteps = new SearchCheckSteps();
    @Test
    public void Search(){

        searchCheckSteps.SetProduct()
                .ChooseFirm()
                .SetMin()
                .SetMax();

    }
}
