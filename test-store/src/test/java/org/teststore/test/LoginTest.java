package org.teststore.test;

import org.junit.Assert;
import org.junit.Test;
import org.teststore.data.dto.LoginDTO;
import org.teststore.data.factory.datafaker.LoginData;
import org.teststore.page.LoginPage;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    LoginData loginData = new LoginData();

    @Test
    public void validarLoginDadosValidos(){
        LoginDTO usu = loginData.loginDadosValidos();
        String msg = loginPage.fazerLogin(usu.getEmail(), usu.getSenha());

        Assert.assertEquals("POPULAR PRODUCTS", msg);
    }

    @Test
    public void validarLoginDadosInvalidos(){
        LoginDTO usu = loginData.loginDadoDinamicos();
        String msg = loginPage.loginEmailIncorreto(usu.getEmail(), usu.getSenha());

        Assert.assertEquals("Authentication failed.", msg);
    }
}
