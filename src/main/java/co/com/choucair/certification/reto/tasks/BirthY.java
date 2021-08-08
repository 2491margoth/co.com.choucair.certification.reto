package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class BirthY implements Task {

    private String strBirthY;

    public BirthY(String strBirthY){this.strBirthY = strBirthY;}

    public static BirthY the(String strBirthY){
        return Tasks.instrumented(BirthY.class,strBirthY);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byValue(strBirthY).from(JoinPage.INPUT_YEAR));
    }
}
