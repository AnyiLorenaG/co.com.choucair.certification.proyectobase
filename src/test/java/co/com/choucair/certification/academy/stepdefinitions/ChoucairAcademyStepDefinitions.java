package co.com.choucair.certification.academy.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.academy.tasks.OpenUp;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ChoucairAcademyStepDefinitions {
Actor Brandon = Actor.named("Brandon");

   @Managed (driver = "chrome")
    WebDriver driver;

   @Before
    public void SetStage() {
    Brandon.can(BrowseTheWeb.with(driver));

    //OnStage.setTheStage(new OnlineCast());
    }


    @Given("Than brandon wants to learn automation at the academy Choucair")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        //OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thepage());
  Brandon.wasAbleTo(Open.url("https://operacion.choucairtesting.com/academy/login/index.php"));
    }

    @When("he search for the course Recursos Automatizacion   Bancolombia on the choucair academy platform")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform() {
     //   OnStage.theActorCalled("Brandon").wasAbleTo();
    }

    @Then("he finds the course called resources Recursos Automatizacion  Bancolombia")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia() {

      //  OnStage.theActorCalled("Brandon").wasAbleTo();

    }





}
