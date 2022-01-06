package tasks;

import models.BusinessUnitData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.BusinessUnitForm;

public class CreateNewBusinessUnitTask implements Task {

    private final BusinessUnitData businessUnitData;

    public CreateNewBusinessUnitTask(BusinessUnitData businessUnitData) {
        this.businessUnitData = businessUnitData;
    }

    public static Performable with(BusinessUnitData businessUnitData){
        return Tasks.instrumented(CreateNewBusinessUnitTask.class, businessUnitData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(businessUnitData.getName()).into(BusinessUnitForm.TXT_NAME),
                //Click.on(BusinessUnitForm.CB_PARENT_UNIT),
                //Click.on(BusinessUnitForm.FIRST_UNIT),
                Click.on(BusinessUnitForm.BTN_SAVE),
                Click.on(BusinessUnitForm.BTN_EXIT)
        );
    }
}
