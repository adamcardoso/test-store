package org.teststore.page.home;

import org.openqa.selenium.By;
import org.teststore.page.BasePage;

public class HomePage extends BasePage {
    private static final By btnSignin = By.cssSelector("#_desktop_user_info > div > a > span");
    private static final By btnLogout = By.cssSelector(".hidden-sm-down.logout");


    public void clicarNoBtnSignin() {
        clicar(btnSignin);
    }

    public void clicarNoBtnLogout() {
        clicar(btnLogout);
    }
}
