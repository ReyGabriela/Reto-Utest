package co.com.choucair.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.utest.userinterface.TellUsAboutYourself.BUTTON_NEXT_LOCATION;
import static co.com.choucair.certification.utest.userinterface.TellUsYourDevices.*;

public class FillDevice implements Task {

    private String strComputer;
    private String strVersion;
    private String strComputerLanguage;
    private String strMobileDevice;
    private String strModel;
    private String strMobileOs;

    public FillDevice(String strComputer, String strVersion, String strComputerLanguage, String strMobileDevice, String strModel, String strMobileOs) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strComputerLanguage = strComputerLanguage;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strMobileOs = strMobileOs;
    }


    public static FillDevice theDeviceInfo(String strComputer, String strVersion, String strComputerLanguage, String strMobileDevice, String strModel, String strMobileOs){
        return Tasks.instrumented(FillDevice.class ,strComputer, strVersion, strComputerLanguage, strMobileDevice, strModel, strMobileOs);
    };


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(DATA_FROM_PC, WebElementStateMatchers.isEnabled()).forNoMoreThan(120).seconds(),
                Click.on(BUTTON_REMOVE_PC),

                Click.on(BUTTON_YOUR_COMPUTER),
                Enter.theValue(strComputer).into(INPUT_YOUR_COMPUTER),
                Hit.the(Keys.DOWN).keyIn(INPUT_YOUR_COMPUTER),
                Hit.the(Keys.ENTER).keyIn(INPUT_YOUR_COMPUTER),
                Click.on(BUTTON_VERSION),
                Enter.theValue(strVersion).into(INPUT_VERSION),
                Hit.the(Keys.DOWN).keyIn(INPUT_VERSION),
                Hit.the(Keys.ENTER).keyIn(INPUT_VERSION),
                Click.on(BUTTON_LANGUAGE_PC),
                Enter.theValue(strComputerLanguage).into(INPUT_LANGUAGE_PC),
                Hit.the(Keys.DOWN).keyIn(INPUT_LANGUAGE_PC),
                Hit.the(Keys.ENTER).keyIn(INPUT_LANGUAGE_PC),

                Click.on(BUTTON_MOBILE),
                Enter.theValue(strMobileDevice).into(INPUT_MOBILE),
                Hit.the(Keys.DOWN).keyIn(INPUT_MOBILE),
                Hit.the(Keys.ENTER).keyIn(INPUT_MOBILE),
                Click.on(BUTTON_MODEL),
                Enter.theValue(strModel).into(INPUT_MODEL),
                Hit.the(Keys.DOWN).keyIn(INPUT_MODEL),
                Hit.the(Keys.ENTER).keyIn(INPUT_MODEL),
                Click.on(BUTTON_MOBILE_OS),
                Enter.theValue(strMobileOs).into(INPUT_MOBILE_OS),
                Hit.the(Keys.DOWN).keyIn(INPUT_MOBILE_OS),
                Hit.the(Keys.ENTER).keyIn(INPUT_MOBILE_OS),
                Click.on(BUTTON_NEXT_LAST_STEP)

        );


    }
}
