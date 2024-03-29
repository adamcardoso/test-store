package org.teststore.test;

import io.qameta.allure.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.teststore.data.factory.seleniumfactory.SeleniumService;

public class BaseTest {

    @BeforeClass
    @Description("Abrir navegador antes da execução da suíte de testes")
    public static void setUp() {
        SeleniumService.abrirNavegador();
    }

    @AfterClass
    @Description("Fechar navegador após a execução da suíte de testes")
    public static void tearDown() {
        //SeleniumService.tearDown();
    }
}
