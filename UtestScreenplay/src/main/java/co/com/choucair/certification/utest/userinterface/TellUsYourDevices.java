package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TellUsYourDevices {

    public static final Target DATA_FROM_PC= Target.the("automatic autocomplete from your computer").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target BUTTON_REMOVE_PC=Target.the("button that removes the autocompletion").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/a/i"));
    public static final Target BUTTON_YOUR_COMPUTER=Target.the("button that shows the computers").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_YOUR_COMPUTER=Target.the("input that contains the computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target BUTTON_VERSION=Target.the("button that shows the version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_VERSION=Target.the("input that contains the version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target BUTTON_LANGUAGE_PC=Target.the("button that shows the pc language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_LANGUAGE_PC=Target.the("field that contains the pc language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target BUTTON_MOBILE=Target.the("button that shows the mobile").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE=Target.the("input that contains the mobile").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target BUTTON_MODEL=Target.the("button that shows the mobile model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MODEL=Target.the("input that contains the mobile model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target BUTTON_MOBILE_OS=Target.the("button that shows the mobile os").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MOBILE_OS=Target.the("input that contains the mobile os").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_NEXT_LAST_STEP = Target.the("button that send us to the next page").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a/span"));

}
