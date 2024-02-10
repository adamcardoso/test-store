package org.teststore.page;

import org.openqa.selenium.By;

public class AuthenticationPage extends BasePage {

    private static final By msgTelaLogin = By.cssSelector("#main > header > h1");
    private static final By campoEmail = By.cssSelector("section input[name='email']");
    private static final By campoSenha = By.cssSelector("input[name='password']");
    private static final By btnAcessar = By.cssSelector("button#submit-login");
    private static final By msgEmailNaoCadastrado = By.cssSelector(".alert.alert-danger");

    public String verificarMensagemNaPaginaDeLogin() {
        return lerTexto(msgTelaLogin);
    }

    public String fazerLogin(String email, String senha) {
        preencherInput(campoEmail, email);
        preencherInput(campoSenha, senha);
        clicar(btnAcessar);

        return lerTexto(msgTelaLogin);
    }

    public String loginEmailNaoCadastrado(String email, String senha) {
        preencherInput(campoEmail, email);
        preencherInput(campoSenha, senha);
        clicar(btnAcessar);

        return lerTexto(msgEmailNaoCadastrado);
    }
}
