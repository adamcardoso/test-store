package org.teststore.data.factory.seleniumfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Objects;

public class SeleniumFactory {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void initBrowser(String url) {
        String caminhoDriver = "drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", caminhoDriver);

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 40);

        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void tearDown() {
        if (Objects.nonNull(driver)) {
            driver.quit();
        }

        // Matar processos do chromedriver
        killChromeDriver();
    }

    private static void killChromeDriver() {
        try {
            // Executar comando para matar processos do chromedriver
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
