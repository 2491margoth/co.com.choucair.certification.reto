package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.model.CommunityUTestData;
import co.com.choucair.certification.reto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class JoinFirstName implements Task {

    private String strFirstName;

    public JoinFirstName(String strFirstName){this.strFirstName = strFirstName;}

    public static JoinFirstName the(String strFirstName){
        return Tasks.instrumented(JoinFirstName.class,strFirstName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(JoinPage.INPUT_NAME));
    }
}
