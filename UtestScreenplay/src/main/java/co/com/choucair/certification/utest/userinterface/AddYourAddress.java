package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AddYourAddress {

    public static final Target INPUT_CITY=Target.the("field that contains the city").located(By.id("city"));
    public static final Target INPUT_CODE=Target.the("field that contains the postal code").located(By.id("zip"));
    public static final Target BUTTON_COUNTRY=Target.the("button that shows the countries").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target INPUT_COUNTRY= Target.the("field that contains the country").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_NEXT_DEVICE = Target.the("button that send us to the next page").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
}


