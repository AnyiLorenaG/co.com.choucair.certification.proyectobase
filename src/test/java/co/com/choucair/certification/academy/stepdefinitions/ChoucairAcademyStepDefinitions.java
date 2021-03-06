package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.certification.academy.model.AcademyChoucairData;
import co.com.choucair.certification.academy.questions.Answer;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;
import co.com.choucair.certification.academy.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class ChoucairAcademyStepDefinitions {


    @Managed(driver = "chrome")
    private WebDriver driver;

    @Before

    public void DoSomethingBefore() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Brandon");
    }


    @Given("Than brandon wants to learn automation at the academy Choucair")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List <AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenUp.thepage(), Login.
                onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }

    @When("he search for the course  on the choucair academy platform")
    public void hesearchforthecourseRecursosAutomatizacionBancolombiaonthechoucairacademyplatform(List<AcademyChoucairData>academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List <AcademyChoucairData>academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));

    }
}
