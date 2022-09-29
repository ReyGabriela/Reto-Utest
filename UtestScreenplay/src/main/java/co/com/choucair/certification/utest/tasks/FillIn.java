package co.com.choucair.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.utest.userinterface.TellUsAboutYourself.*;

public class FillIn implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strUserLanguage;

    public FillIn(String strFirstName, String strLastName, String strEmailAddress, String strMonth, String strDay, String strYear, String strUserLanguage) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strUserLanguage = strUserLanguage;
    }

    public static FillIn thePersonalInfo(String strFirstName, String strLastName, String strEmailAddress, String strMonth, String strDay, String strYear, String strUserLanguage) {
        return Tasks.instrumented(FillIn.class,strFirstName, strLastName, strEmailAddress, strMonth, strDay, strYear, strUserLanguage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strFirstName).into(INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(INPUT_LASTNAME),
                Enter.theValue(strEmailAddress).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(INPUT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(INPUT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(INPUT_YEAR),
                Click.on(INPUT_LANGUAGE),
                Enter.theValue(strUserLanguage).into(INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).keyIn(INPUT_LANGUAGE),
                Click.on(BUTTON_NEXT_LOCATION)

        );
    }
}
