package org.teststore.data.factory.seleniumfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.teststore.util.ConfigProperties;

import java.time.Duration;
import java.util.Objects;

public class SeleniumService {
    public static final String APP_URL = "AppURL";

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void abrirNavegador() {
        ConfigProperties.initializePropertyFile();

        switch (ConfigProperties.properties.getProperty("BrowserType")) {
            case "chrome":
                driver = new ChromeDriver();
                wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                driver.get(ConfigProperties.properties.getProperty(APP_URL));
                driver.manage().window().maximize();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                driver.get(ConfigProperties.properties.getProperty(APP_URL));
                driver.manage().window().maximize();
                break;
            case "edge":
                driver = new EdgeDriver();
                wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                driver.get(ConfigProperties.properties.getProperty(APP_URL));
                driver.manage().window().maximize();
                break;
            default:
                driver = new ChromeDriver();
                wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                driver.get(ConfigProperties.properties.getProperty(APP_URL));
                driver.manage().window().maximize();
                break;
        }
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
