package org.teststore.test.login;

import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;
import org.teststore.data.dto.LoginDTO;
import org.teststore.data.factory.datafaker.LoginData;
import org.teststore.page.login.AuthenticationPage;
import org.teststore.page.home.HomePage;
import org.teststore.test.BaseTest;

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
        authenticationPage.fazerLogin(usu.getEmail(), usu.getSenha());

        homePage.clicarNoBtnLogout();
    }

    @Test
    @Description("Invalidar login com email não cadastrado")
    @Story("Autenticação de usuário")
    @Step("Executando login com email não cadastrado")
    @Severity(SeverityLevel.NORMAL)
    public void invalidarLoginComEmailNaoCadastrado() {
        homePage.clicarNoBtnSignin();
        String msgTelaLogin = authenticationPage.verificarMensagemNaPaginaDeLogin();

        Assert.assertEquals("Log in to your account", msgTelaLogin);

        LoginDTO usu = loginData.loginDadoDinamicos();
        String msg = authenticationPage.loginEmailNaoCadastrado(usu.getEmail(), usu.getSenha());

        Assert.assertEquals("Authentication failed.", msg);
    }
}
