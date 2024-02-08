package org.teststore.page;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    private static final By campoEmail = By.cssSelector("section input[name='email']");
    private static final By campoSenha = By.cssSelector("input[name='password']");
    private static final By btnAcessar = By.cssSelector("button#submit-login");
    private static final By textMsgBtn = By.cssSelector("#content > section > h2");
    private static final By msgEmailIncorreto = By.cssSelector(".alert.alert-danger");

    public void preencherCampoEmail(String email){
        preencherInput(campoEmail, email);
    }

    public void preencherCampoSenha(String senha){
        preencherInput(campoSenha, senha);
    }

    public void clicarBtnAcessar(){
        clicar(btnAcessar);
    }

    public String validarTextoBtnAposLogin(){
        return lerTexto(textMsgBtn);
    }

    public String validarMsgEmailIncorreto(){
        return lerTexto(msgEmailIncorreto);
    }

    public String fazerLogin(String email, String senha){
        preencherInput(campoEmail, email);
        preencherInput(campoSenha, senha);
        clicar(btnAcessar);

        return lerTexto(textMsgBtn);
    }

    public String loginEmailIncorreto(String email, String senha){
        preencherInput(campoEmail, email);
        preencherInput(campoSenha, senha);
        clicar(btnAcessar);

        return lerTexto(msgEmailIncorreto);
    }
}
