package userinterface;

import org.openqa.selenium.By;

public class BusinessUnitForm {

    public static final By BTN_CREATE_BUSINESS_UNIT = By.xpath("//body/main[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]");
    public static final By TXT_NAME = By.xpath("//input[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Name']");
    public static final By CB_PARENT_UNIT = By.xpath("//div[@id='s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId']");

    public static final By TXT_SEARCH = By.xpath("//input[@id='s2id_autogen4_search']");
    public static final By FIRST_UNIT = By.xpath("//div[@id='select2-result-label-24']");

    public static final By BTN_SAVE = By.xpath("//body/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]");
    public static final By BTN_EXIT = By.cssSelector("");

    public static final By MSG_SUCCESSFULLY = By.xpath("//div[contains(text(),'Save success')]");
}
