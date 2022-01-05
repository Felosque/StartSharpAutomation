package userinterface;

import org.openqa.selenium.By;

public class MeetingForm {

    public static final By BTN_NEW_MEETING = By.xpath("//body/main[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]");

    public static final By TXT_NAME = By.xpath("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingName']");
    public static final By SELECT_TYPE = By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId']");
    public static final By TXT_NUMBER = By.xpath("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber']");
    public static final By TXT_START_DATE = By.xpath("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_StartDate']");
    public static final By TXT_END_DATE = By.xpath("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_EndDate']");
    public static final By SELECT_LOCATION = By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId']");
    public static final By SELECT_UNIT = By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId']");
    public static final By SELECT_ORGANIZED_BY = By.xpath("//span[@id='select2-chosen-9']");
    public static final By SELECT_REPORTER = By.xpath("//span[@id='select2-chosen-10']");
    public static final By SELECT_ATTENDEE = By.xpath("//div[@id='s2id_autogen11']");

    public static final By BTN_SAVE = By.xpath("//body/main[1]/section[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public static final By SEARCH_MEETING = By.xpath("//body/main[1]/section[1]/div[1]/div[2]/div[1]/input[1]");
    public static final By FIRST_ROW = By.xpath("//body/main[1]/section[1]/div[1]/div[3]/div[4]/div[3]/div[1]/div[1]");

}
