package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.apache.commons.net.imap.IMAPClient;
import org.eclipse.jetty.util.SearchPattern;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Type;

public class Device implements Task {

    private String strDevice;

    public Device (String strDevice){this.strDevice = strDevice;}

    public static Device the(String strDevice){
        return Tasks.instrumented(Device.class,strDevice);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JoinPage.INPUT_DEVICE),
                Enter.theValue(strDevice).into(JoinPage.INPUT_DEVICE2)
                );
    }
}
