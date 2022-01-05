package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import models.MeetingData;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.MeetingQuestions;
import tasks.CreateNewMeetingTask;
import userinterface.BurgerMainMenu;
import userinterface.MeetingForm;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;

public class MeetingStepsDefinitions {

    @Before
    public void setStage(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Given("The user goes to the meeting section")
    public void the_user_goes_to_the_meeting_section() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(BurgerMainMenu.MEETING_TAB),
                Click.on(BurgerMainMenu.BTN_NEW_MEETING)
        );
    }

    @When("The user select the option to create a new meeting")
    public void the_user_select_the_option_to_create_a_new_meeting() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(MeetingForm.BTN_NEW_MEETING)
        );
    }

    private String meetingName;
    @When("The user fills the form to create a new meeting with the data")
    public void the_user_fills_the_form_to_create_a_new_meeting_with_the_data(List<MeetingData> data) {
        meetingName = data.get(0).getName();
        theActorInTheSpotlight().attemptsTo(
                CreateNewMeetingTask.with(data.get(0))
        );
    }

    @Then("the meet is created")
    public void the_meet_is_created() {
        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(meetingName).into(MeetingForm.SEARCH_MEETING)
        );
        theActorInTheSpotlight().should(seeThat(
                "The new meeting", MeetingQuestions.isTheMeetingVisible(), is(true)
        ));
    }
}
