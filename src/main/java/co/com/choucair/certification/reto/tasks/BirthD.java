package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class BirthD implements Task {

    private String strBirthD;

    public BirthD(String strBirthD){this.strBirthD = strBirthD;}

    public static BirthD the(String strBirthD){
        return Tasks.instrumented(BirthD.class,strBirthD);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byValue(strBirthD).from(JoinPage.INPUT_DAY));
    }
}
