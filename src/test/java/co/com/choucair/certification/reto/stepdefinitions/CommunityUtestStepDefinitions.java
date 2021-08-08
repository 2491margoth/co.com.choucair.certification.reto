package co.com.choucair.certification.reto.stepdefinitions;
import co.com.choucair.certification.reto.model.CommunityUTestData;
import co.com.choucair.certification.reto.tasks.*;
import co.com.choucair.certification.reto.userinterface.JoinPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class CommunityUtestStepDefinitions {

        @Before
        public void setStage (){
            OnStage.setTheStage(new OnlineCast());
        }

        @Given("^than brandon wants to join to utest$")
        public void thanbrandonwantstojointoutest() {
            OnStage.theActorCalled("brandon") .wasAbleTo(OpenUp.thePage());
        }

        @When("^he clic on Join Today option$")
        public void heClicOnJoinTodayOption(List<CommunityUTestData> communityUTestData) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Join.the(communityUTestData.get(0).getStrJoin()),
                    JoinFirstName.the(communityUTestData.get(0).getStrFirstName()),
                    JoinLastName.the(communityUTestData.get(0).getStrLastName()),
                    JoinEmail.the(communityUTestData.get(0).getStrEmail()),
                    BirthM.the(communityUTestData.get(0).getStrBirthM()),
                    BirthD.the(communityUTestData.get(0).getStrBirthD()),
                    BirthY.the(communityUTestData.get(0).getStrBirthY()),
                    Click.on(JoinPage.BUTTON_NEXTLOC),

                    Zip.the(communityUTestData.get(0).getStrZip()),
                    Click.on(JoinPage.BUTTON_NEXTDEVICE),

                    Device.the(communityUTestData.get(0).getStrDevice()),
                    Model.the(communityUTestData.get(0).getStrModel()),
                    OS.the(communityUTestData.get(0).getStrOS()),

                    Click.on(JoinPage.BUTTON_NEXTLASTSTEP),

                    Pass.the(communityUTestData.get(0).getStrPass()),
                    ConfirmPass.the(communityUTestData.get(0).getStrConfirmPass()),

                    Click.on(JoinPage.INPUT_TERMS),
                    Click.on(JoinPage.INPUT_SECURITY),
                    Click.on(JoinPage.BUTTON_COMPLETE)

                    );
        }
        //, JoinPage.the(communityUTestData.get(0).getStrJoin())
    ///html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a/span

        /*@Then("^he create a new user$")
        public void heCreateANewUser(DataTable arg1) {
                throw new PendingException();
        }*/

        /*When("^he clic on Join Today option$", () -> {
        });
        Then("^he create a new user$", () -> {
        });*/

}
