package org.teststore.test;

import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;
import org.teststore.data.dto.LoginDTO;
import org.teststore.data.factory.datafaker.LoginData;
import org.teststore.page.AuthenticationPage;
import org.teststore.page.HomePage;

public class LoginTest extends BaseTest {

    HomePage homePage = new HomePage();
    AuthenticationPage authenticationPage = new AuthenticationPage();
    LoginData loginData = new LoginData();

    @Test
    @Description("Validar login com dados válidos")
    @Story("Autenticação de usuário")
    @Step("Executando login com dados válidos")
    @Severity(SeverityLevel.NORMAL)
    public void validarLoginComDadosValidos() {
        homePage.clicarNoBtnSignin();
        String msgTelaLogin = authenticationPage.verificarMensagemNaPaginaDeLogin();

        Assert.assertEquals("Log in to your account", msgTelaLogin);

        LoginDTO usu = loginData.loginDadosValidos();
        String msg = authenticationPage.fazerLogin(usu.getEmail(), usu.getSenha());

        Assert.assertEquals("Your account", msg);
    }

    @Test
    @Description("Invalidar login com dados inválidos")
    @Story("Autenticação de usuário")
    @Step("Executando login com dados inválidos")
    @Severity(SeverityLevel.NORMAL)
    public void invalidarLoginComDadosInvalidos() {
        homePage.clicarNoBtnSignin();
        String msgTelaLogin = authenticationPage.verificarMensagemNaPaginaDeLogin();

        Assert.assertEquals("Log in to your account", msgTelaLogin);

        LoginDTO usu = loginData.loginDadoDinamicos();
        String msg = authenticationPage.loginEmailIncorreto(usu.getEmail(), usu.getSenha());

        Assert.assertEquals("Authentication failed.", msg);
    }
}
