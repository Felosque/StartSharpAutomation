package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import navigation.NavigateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.LoginQuestions;
import tasks.LoginUserTask;

public class LoginStepsDefinitions {

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("User login in the StartSharp with the user {string} and password {string}")
    public void user_login_in_the_StartSharp_with_the_user_and_password(String user, String password) {
        OnStage.theActorCalled(user).attemptsTo(
                NavigateTo.theStartSharpLoginPage(),
                LoginUserTask.with(user, password)
        );
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
            "The displayed text", LoginQuestions.titleLogIn(), Matchers.equalTo("Dashboard")
        ));
    }

}
