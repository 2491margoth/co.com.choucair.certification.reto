package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class JoinLastName implements Task {

    private String strLastName;

    public JoinLastName(String strLastName){this.strLastName = strLastName;}

    public static JoinLastName the(String strLastName){
        return Tasks.instrumented(JoinLastName.class,strLastName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strLastName).into(JoinPage.INPUT_LASTN));
    }
}
