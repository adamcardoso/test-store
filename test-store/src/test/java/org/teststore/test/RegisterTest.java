package org.teststore.test;

import org.junit.Assert;
import org.junit.Test;
import org.teststore.data.dto.RegisterDTO;
import org.teststore.data.factory.datafaker.RegisterData;
import org.teststore.page.RegisterPage;

public class RegisterTest extends BaseTest {
    RegisterPage registerPage = new RegisterPage();
    RegisterData registerData = new RegisterData();

    @Test
    public void validarLoginDadosValidos() {
        registerPage.clicarNoBtnSignin();
        String msgTelaLogin = registerPage.verificarMensagemNaPaginaDeLogin();
        Assert.assertEquals("Log in to your account", msgTelaLogin);

        registerPage.clicarNoBtnDeCadastrar();
        String msgTelaDeCadastro = registerPage.verificarMensagemNaPaginaDeCadastro();
        Assert.assertEquals("Create an account", msgTelaDeCadastro);

        RegisterDTO usu = registerData.cadastroDadoDinamicos();
        String msg = registerPage.fazerCadastro(usu);

        Assert.assertEquals("Create an account", msg);
    }
}
