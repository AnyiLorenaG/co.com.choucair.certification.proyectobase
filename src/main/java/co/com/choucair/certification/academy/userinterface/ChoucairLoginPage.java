package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("Select the enter button").located(By.xpath("//div[@class='d-none d-lg-block']//a[@class='btn btn-info btn-sm text-white']"));
    public static final Target INPUT_USER = Target.the("Enter username").locatedBy("//input[@name='username']");
    public static final Target INPUT_PASSWORD = Target.the("Enter password ").locatedBy("//input[@name='password']");
    public static final Target ENTER_BUTTON = Target.the("Clic on the access button").locatedBy("//button[@class='btn btn-primary']");

}
