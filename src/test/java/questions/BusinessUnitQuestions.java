package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import userinterface.BusinessUnitForm;

public class BusinessUnitQuestions {

    public static Question<Boolean> isSuccessfullyMessageVisible(){
        return actor -> WebElementQuestion.the(BusinessUnitForm.MSG_SUCCESSFULLY).answeredBy(actor).isCurrentlyVisible();
    }
}
