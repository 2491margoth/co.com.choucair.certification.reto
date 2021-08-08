package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class OS implements Task {

    private String strOS;

    public OS (String strOS){this.strOS = strOS;}

    public static OS the(String strOS){
        return Tasks.instrumented(OS.class,strOS);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        /*actor.attemptsTo(
                Click.on(JoinPage.INPUT_OS),
                Enter.theValue(strOS).into(JoinPage.INPUT_OS2)
        );*/
    }
}