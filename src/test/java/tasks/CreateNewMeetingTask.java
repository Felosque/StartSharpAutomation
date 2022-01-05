package tasks;

import models.MeetingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.MeetingForm;

public class CreateNewMeetingTask implements Task {

    private final MeetingData meetingData;

    public CreateNewMeetingTask(MeetingData meetingData) {
        this.meetingData = meetingData;
    }

    public static Performable with(MeetingData meetingData){
        return Tasks.instrumented(CreateNewMeetingTask.class, meetingData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(meetingData.getName()).into(MeetingForm.TXT_NAME),
                Enter.theValue(meetingData.getNumber()).into(MeetingForm.TXT_NUMBER),
                Clear.field(MeetingForm.TXT_START_DATE),
                Enter.theValue(meetingData.getStartDate()).into(MeetingForm.TXT_START_DATE),
                Clear.field(MeetingForm.TXT_END_DATE),
                Enter.theValue(meetingData.getEndDate()).into(MeetingForm.TXT_END_DATE)
        );
    }
}
