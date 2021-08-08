package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class Zip implements Task {

    private String strZip;

    public Zip (String strZip){this.strZip = strZip;}

    public static Zip the(String strZip){
        return Tasks.instrumented(Zip.class,strZip);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strZip).into(JoinPage.INPUT_ZIP));
    }
}

