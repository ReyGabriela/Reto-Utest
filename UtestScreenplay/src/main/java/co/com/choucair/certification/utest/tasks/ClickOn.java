package co.com.choucair.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.utest.userinterface.UtestPage.JOIN_TODAY_BUTTON;

public class ClickOn implements Task {
    public static ClickOn joinToday() {
        return Tasks.instrumented(ClickOn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JOIN_TODAY_BUTTON));

    }
}
