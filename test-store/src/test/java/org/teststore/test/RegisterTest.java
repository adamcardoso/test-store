package org.teststore.test;

import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;
import org.teststore.data.dto.RegisterDTO;
import org.teststore.data.factory.datafaker.RegisterData;
import org.teststore.page.HomePage;
import org.teststore.page.RegisterPage;

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

    @Test
    @Description("Invalidar cadastro com dados inválidos")
    @Story("Cadastro de usuário")
    @Severity(SeverityLevel.NORMAL)
    public void invalidarCadastroDadosInvalidos() {
        homePage.clicarNoBtnSignin();
        String msgTelaLogin = registerPage.verificarMensagemNaPaginaDeLogin();
        Assert.assertEquals("Log in to your account", msgTelaLogin);

        registerPage.clicarNoBtnDeCadastrar();
        String msgTelaDeCadastro = registerPage.verificarMensagemNaPaginaDeCadastro();
        Assert.assertEquals("Create an account", msgTelaDeCadastro);

        RegisterDTO usu = registerData.tentativaDeCadastroDeUsuarioComDadosInalidos();
        String msgSenhaMenorQuePermitido = registerPage.verificarMensagemDeSenhaMenorQueCincoCampos();

        registerPage.fazerCadastro(usu);

        Assert.assertEquals("", msgSenhaMenorQuePermitido);
    }
}
