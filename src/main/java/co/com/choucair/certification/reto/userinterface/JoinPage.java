package co.com.choucair.certification.reto.userinterface;

import co.com.choucair.certification.reto.tasks.Join;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class JoinPage extends PageObject{
///html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a
///html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a
///html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a
    public static final Target BUTTON_JOIN  = Target.the("Selecciona el boton Join")
            .located(By.xpath("html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_NAME  = Target.the("Escribir primer nombre")
            .located(By.xpath("html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/input"));
    public static final Target INPUT_LASTN  = Target.the("Escribir apellido")
            .located(By.xpath("html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[2]/input"));
    public static final Target INPUT_EMAIL  = Target.the("Escribir email")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[3]/input"));
    public static final Target INPUT_MONTH  = Target.the("Escribir mes")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));
    public static final Target INPUT_DAY  = Target.the("Escribir dia")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select"));
    public static final Target INPUT_YEAR  = Target.the("Escribir anio")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select"));
    public static final Target BUTTON_NEXTLOC  = Target.the("Da clic en Next Location")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a/span"));

    public static final Target INPUT_ZIP  = Target.the("Escribir ZIP")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[3]/input"));
    public static final Target BUTTON_NEXTDEVICE  = Target.the("Da clic en Next Device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));


    public static final Target INPUT_DEVICE  = Target.the("Escribir DEVICE")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_DEVICE2  = Target.the("Escribir DEVICE2")
            .located(By.xpath("html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
    /*public static final Target INPUT_MODELO  = Target.the("Escribir MODELO")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MODELO2  = Target.the("Escribir MODELO2")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
    public static final Target INPUT_OS  = Target.the("Escribir OS")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_OS2  = Target.the("Escribir OS2")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));*/
    public static final Target BUTTON_NEXTLASTSTEP  = Target.the("Da clic en Next LAST STEP")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a/span"));

    public static final Target INPUT_PASS  = Target.the("Escribir pass")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[1]/input"));
    public static final Target INPUT_CONFIRMPASS  = Target.the("Escribir confirmar pass")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[2]/input"));

    public static final Target INPUT_TERMS  = Target.the("Aceptar terminos")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target INPUT_SECURITY  = Target.the("Aceptar seguridad")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_COMPLETE  = Target.the("COMPLETAR")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));



    public static Performable the(String strJoin) {

        return Tasks.instrumented(Join.class,strJoin);

    }

}
