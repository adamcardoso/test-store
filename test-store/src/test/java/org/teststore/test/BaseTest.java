package org.teststore.test;

import org.junit.Before;
import org.teststore.data.factory.seleniumfactory.SeleniumFactory;

public class BaseTest {
    private static final String url = "http://teststore.automationtesting.co.uk";

    @Before
    public void abrirNavegador(){
        SeleniumFactory.abrirNavegador(url);
    }

    /*@After
    public void fecharNavegador(){
        SeleniumFactory.tearDown();
    }*/
}
