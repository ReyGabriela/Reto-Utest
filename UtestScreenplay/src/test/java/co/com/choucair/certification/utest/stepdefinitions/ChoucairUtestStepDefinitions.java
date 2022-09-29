package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.UtestInfo;
import co.com.choucair.certification.utest.questions.Answer;
import co.com.choucair.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairUtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that gabriela wants to sign up to utest$")
    public void thatGabrielaWantsToSignUpToUtest() {
        OnStage.theActorCalled("Gabriela").wasAbleTo(OpenUp.thePage());

    }


    @When("^she clicks the JoinToday button$")
    public void sheClicksTheJoinTodayButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOn.joinToday());
    }

    @When("^she introduces the personal data$")
    public void sheIntroducesThePersonalData(List<UtestInfo> uTestInfo) {
        OnStage.theActorInTheSpotlight().attemptsTo((FillIn.thePersonalInfo(
                uTestInfo.get(0).getStrFirstName(),
                uTestInfo.get(0).getStrLastName(),
                uTestInfo.get(0).getStrEmailAddress(),
                uTestInfo.get(0).getStrMonth(),
                uTestInfo.get(0).getStrDay(),
                uTestInfo.get(0).getStrYear(),
                uTestInfo.get(0).getStrUserLanguage()
        )));
        OnStage.theActorInTheSpotlight().attemptsTo(FillAddress.theLocation(
                uTestInfo.get(0).getStrCity(),
                uTestInfo.get(0).getStrZipPostalCode(),
                uTestInfo.get(0).getStrCountry()
        ));
        OnStage.theActorInTheSpotlight().attemptsTo(FillDevice.theDeviceInfo(
                uTestInfo.get(0).getStrComputer(),
                uTestInfo.get(0).getStrVersion(),
                uTestInfo.get(0).getStrComputerLanguage(),
                uTestInfo.get(0).getStrMobileDevice(),
                uTestInfo.get(0).getStrModel(),
                uTestInfo.get(0).getStrMobileOs()
        ));
        OnStage.theActorInTheSpotlight().attemptsTo(FillLastStep.thePasswordInfo(
                uTestInfo.get(0).getStrPassword()
        ));

    }

    @Then("^the registration is complete$")
    public void theRegistrationIsComplete(List<UtestInfo> UtestInfo) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(UtestInfo.get(0).getStrSuccessfulSignUpMessage())));
    }

}
