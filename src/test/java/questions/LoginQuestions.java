package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import userinterface.LoginForm;

public class LoginQuestions {


    public static Question<String> titleLogIn(){
        return actor -> TextContent.of(LoginForm.LBL_DASHBOARD).answeredBy(actor).trim();
    }
}
