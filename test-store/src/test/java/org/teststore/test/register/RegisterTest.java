package org.teststore.test.register;

import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;
import org.teststore.data.dto.RegisterDTO;
import org.teststore.data.factory.datafaker.RegisterData;
import org.teststore.page.home.HomePage;
import org.teststore.page.register.RegisterPage;
import org.teststore.test.BaseTest;

public class RegisterTest extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterData registerData = new RegisterData();

    @Test
    @Description("Validar cadastro com dados válidos")
    @Story("Cadastro de usuário")
    @Severity(SeverityLevel.NORMAL)
    public void validarCadastroDadosValidos() {
        homePage.clicarNoBtnSignin();
        String msgTelaLogin = registerPage.verificarMensagemNaPaginaDeLogin();
        Assert.assertEquals("Log in to your account", msgTelaLogin);

        registerPage.clicarNoBtnDeCadastrar();
        String msgTelaDeCadastro = registerPage.verificarMensagemNaPaginaDeCadastro();
        Assert.assertEquals("Create an account", msgTelaDeCadastro);

        RegisterDTO usu = registerData.cadastroDeUsuarioComDadosValidos();

        registerPage.fazerCadastro(usu);
    }
}
