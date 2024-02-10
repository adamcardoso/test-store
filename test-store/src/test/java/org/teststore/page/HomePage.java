package org.teststore.page;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    private static final By btnSignin = By.cssSelector("#_desktop_user_info > div > a > span");
    private static final By btnLogout = By.cssSelector(".hidden-sm-down.logout");


    public void clicarNoBtnSignin() {
        clicar(btnSignin);
    }

    public void clicarNoBtnLogout() {
        clicar(btnLogout);
    }
}
