package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class ConfirmPass implements Task {

    private String strConfirmPass;

    public ConfirmPass(String strConfirmPass){this.strConfirmPass = strConfirmPass;}

    public static ConfirmPass the(String strConfirmPass){
        return Tasks.instrumented(ConfirmPass.class,strConfirmPass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strConfirmPass).into(JoinPage.INPUT_CONFIRMPASS));
    }
}
