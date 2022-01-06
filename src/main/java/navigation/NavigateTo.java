package navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.BurgerMainMenu;

public class NavigateTo  {

    public static Performable theStartSharpLoginPage() {
        return Task.where("{0} opens the StartSharp login page",
                Open.browserOn().the(LoginPage.class)
        );
    }

    public static Performable theBusinessUnitSection(){
        return Task.where("{0} going to the Business Unit",
                Click.on(BurgerMainMenu.ORGANIZATION_TAB), Click.on(BurgerMainMenu.BTN_BUSINESS_UNIT));
    }

}