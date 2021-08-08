package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class JoinEmail implements Task {

    private String strEmail;

    public JoinEmail(String strEmail){this.strEmail = strEmail;}

    public static JoinEmail the(String strEmail){
        return Tasks.instrumented(JoinEmail.class,strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strEmail).into(JoinPage.INPUT_EMAIL));
    }
}
