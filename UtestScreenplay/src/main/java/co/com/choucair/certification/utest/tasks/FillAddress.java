package co.com.choucair.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.utest.userinterface.AddYourAddress.*;
import static co.com.choucair.certification.utest.userinterface.TellUsAboutYourself.BUTTON_NEXT_LOCATION;

public class FillAddress implements Task {
    private String strCity;
    private String strZipPostalCode;
    private String strCountry;


    public FillAddress (String strCity, String strZipPostalCode, String strCountry) {
        this.strCity = strCity;
        this.strZipPostalCode = strZipPostalCode;
        this.strCountry = strCountry;
    }
    public static FillAddress theLocation(String strCity, String strZipPostalCode, String strCountry) {
        return Tasks.instrumented(FillAddress.class,strCity,strZipPostalCode,strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCity).into(INPUT_CITY),
                Hit.the(Keys.DOWN).keyIn(INPUT_CITY), //no lo detectaba con el select from options
                Hit.the(Keys.ENTER).keyIn(INPUT_CITY),
                Enter.theValue(strZipPostalCode).into(INPUT_CODE),
                Click.on(BUTTON_COUNTRY),
                Enter.theValue(strCountry).into(INPUT_COUNTRY),
                Click.on(BUTTON_NEXT_DEVICE)
        );
    }
}
