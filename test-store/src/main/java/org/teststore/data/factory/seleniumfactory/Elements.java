package org.teststore.data.factory.seleniumfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elements extends SeleniumService {

    // método para pegar um elemento
    public static WebElement element(By by){
        return driver.findElement(by);
    }

    // método para esperar um elemento
    public static void esperarElemento(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
