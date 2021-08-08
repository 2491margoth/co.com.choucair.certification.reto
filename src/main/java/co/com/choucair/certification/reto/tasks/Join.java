package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class Join implements Task {

    private String strJoin;

    public Join(String strJoin) {
        this.strJoin = strJoin;
    }


    public static Join the(String strJoin){
        return Tasks.instrumented(Join.class,strJoin);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(JoinPage.BUTTON_JOIN)
        );

    }

}
