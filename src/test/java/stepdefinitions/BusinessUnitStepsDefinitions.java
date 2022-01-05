package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import models.BusinessUnitData;
import navigation.NavigateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.BusinessUnitQuestions;
import tasks.CreateNewBusinessUnitTask;
import userinterface.BusinessUnitForm;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;
import static questions.BusinessUnitQuestions.*;

public class BusinessUnitStepsDefinitions {

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Given("The user goes to the business unit section")
    public void the_user_goes_to_the_business_unit_section() {
        theActorInTheSpotlight().attemptsTo(
                NavigateTo.theBusinessUnitSection()
        );
    }

    @When("The user select the option to create a new Business Unit")
    public void the_user_select_the_option_to_create_a_new_Business_Unit() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(BusinessUnitForm.BTN_CREATE_BUSINESS_UNIT)
        );
    }

    @When("The user fills the form to create a Business Unit with the data")
    public void the_user_fills_the_form_to_create_a_Business_Unit_with_the_data(List<BusinessUnitData> data) {
        theActorInTheSpotlight().attemptsTo(
                CreateNewBusinessUnitTask.with(data.get(0))
        );
    }

    @Then("the business unit is created")
    public void the_business_unit_is_created() {
        theActorInTheSpotlight().should(seeThat(
                "the message successfully", isSuccessfullyMessageVisible(), is(true)
        ));
    }

}
