package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button to start the sing up process").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target COMPLETED_REGISTER = Target.the("page that tell us we are now registered").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));

}
