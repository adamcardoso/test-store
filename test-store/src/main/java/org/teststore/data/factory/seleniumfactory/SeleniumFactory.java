package org.teststore.data.factory.seleniumfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Objects;

public class SeleniumFactory {
    public static WebDriver driver;
    public static WebDriverWait wait;
    protected static final int tempoDeEspera = 20;

    public static void abrirNavegador(String url) {
        String caminhoDriver = "drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", caminhoDriver);

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, tempoDeEspera);

        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void tearDown() {
        if (Objects.nonNull(driver)) {
            driver.quit();
        }else {
            killChromeDriver();
        }
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
