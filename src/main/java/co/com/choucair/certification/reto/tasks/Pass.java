package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class Pass implements Task {

    private String strPass;

    public Pass(String strPass){this.strPass = strPass;}

    public static Pass the(String strPass){
        return Tasks.instrumented(Pass.class,strPass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPass).into(JoinPage.INPUT_PASS));
    }
}
