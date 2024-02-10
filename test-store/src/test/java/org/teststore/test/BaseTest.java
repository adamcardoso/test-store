package org.teststore.test;

import org.junit.After;
import org.junit.Before;
import org.teststore.data.factory.seleniumfactory.SeleniumFactory;

public class BaseTest {
    @Before
    public void abrirNavegador(){
        SeleniumFactory.initBrowser("http://teststore.automationtesting.co.uk");
    }

    @After
    public void fecharNavegador(){
        SeleniumFactory.tearDown();
    }
}
