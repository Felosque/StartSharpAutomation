package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import userinterface.MeetingForm;

public class MeetingQuestions {

    public static Question<Boolean> isTheMeetingVisible(){
        return actor -> WebElementQuestion.the(MeetingForm.FIRST_ROW).answeredBy(actor).isCurrentlyVisible();
    }
}
