package userinterface;

import org.openqa.selenium.By;

public class LoginForm {

    public static final By USERNAME = By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Username']");
    public static final By PASSWORD = By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Password']");

    public static final By SUMMIT = By.xpath("//button[@id='StartSharp_Membership_LoginPanel0_LoginButton']");

    public static final By LBL_DASHBOARD = By.xpath("//h1[contains(text(),'Dashboard')]");
}
