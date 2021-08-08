package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class BirthM implements Task {

    private String strBirthM;

    public BirthM(String strBirthM){this.strBirthM = strBirthM;}

    public static BirthM the(String strBirthM){
        return Tasks.instrumented(BirthM.class,strBirthM);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byValue(strBirthM).from(JoinPage.INPUT_MONTH));
    }
}
