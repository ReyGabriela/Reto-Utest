package co.com.choucair.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.utest.userinterface.TheLastStep.*;
import static co.com.choucair.certification.utest.userinterface.UtestPage.COMPLETED_REGISTER;

public class FillLastStep implements Task {
    private String strPassword;

    public FillLastStep(String strPassword) {
        this.strPassword = strPassword;
    }
    public static FillLastStep thePasswordInfo(String strPassword) {
        return Tasks.instrumented(FillLastStep.class, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(strPassword).into(PASSWORD),
                Enter.theValue(strPassword).into(PASSWORD_CONFIRMATION),
                Click.on(BUTTON_STAY_INFORMED),
                Click.on(BUTTON_TERMS),
                Click.on(BUTTON_PRIVACY_POLICY),
                Click.on(BUTTON_COMPLETE),
                WaitUntil.the(COMPLETED_REGISTER, WebElementStateMatchers.isEnabled()).forNoMoreThan(90).seconds()

        );
    }
}
