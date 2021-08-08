package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Model implements Task {

    private String strModel;

    public Model (String strModel){this.strModel = strModel;}

    public static Model the(String strModel){
        return Tasks.instrumented(Model.class,strModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        /*actor.attemptsTo(
                Click.on(JoinPage.INPUT_MODELO),
                Enter.theValue(strModel).into(JoinPage.INPUT_MODELO2)
        );*/
    }
}
