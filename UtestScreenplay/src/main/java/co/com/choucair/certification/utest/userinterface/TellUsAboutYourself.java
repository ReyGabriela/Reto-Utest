package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TellUsAboutYourself {

    public static final Target INPUT_FIRSTNAME=Target.the("input that stores first name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME=Target.the("input that stores the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL=Target.the("input that stores the email").located(By.id("email"));

    public static final Target INPUT_MONTH=Target.the("input to choose the birth month").located(By.id("birthMonth"));
    public static final Target INPUT_DAY=Target.the("input to choose the birth day").located(By.id("birthDay"));
    public static final Target INPUT_YEAR=Target.the("input to choose the birth year").located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGE=Target.the("input to select the language").located(By.xpath("//div[@id='languages']//input[@type='search']"));

    public static final Target BUTTON_NEXT_LOCATION = Target.the("button that send us to the next page").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
