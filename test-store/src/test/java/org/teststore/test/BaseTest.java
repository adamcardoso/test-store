package org.teststore.test;

import io.qameta.allure.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.teststore.data.factory.seleniumfactory.SeleniumFactory;

public class BaseTest {
    private static final String url = "http://teststore.automationtesting.co.uk";

    @BeforeClass
    @Description("Abrir navegador antes da execução da suíte de testes")
    @Severity(SeverityLevel.NORMAL)
    public static void setUp() {
        SeleniumFactory.abrirNavegador(url);
    }

    @AfterClass
    @Description("Fechar navegador após a execução da suíte de testes")
    @Severity(SeverityLevel.NORMAL)
    public static void tearDown() {
        SeleniumFactory.tearDown();
    }
}
