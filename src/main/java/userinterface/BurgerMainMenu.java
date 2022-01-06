package userinterface;

import org.openqa.selenium.By;

public class BurgerMainMenu {

    public static final By ORGANIZATION_TAB = By.xpath("//span[contains(text(),'Organization')]");
    public static final By MEETING_TAB = By.xpath("//span[contains(text(),'Meeting')]");

    public static final By BTN_BUSINESS_UNIT = By.xpath("//span[contains(text(),'Business Units')]");
    public static final By BTN_NEW_MEETING = By.xpath("//span[contains(text(),'Meetings')]");
}
