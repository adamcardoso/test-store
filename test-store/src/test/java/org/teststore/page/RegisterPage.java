package org.teststore.page;

import org.openqa.selenium.By;
import org.teststore.data.dto.RegisterDTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RegisterPage extends BasePage{
    private static final By btnCadastrar = By.cssSelector("[data-link-action='display-register-form']");
    private static final By btnSave = By.cssSelector("#customer-form > footer > button");
    private static final By msgTelaLogin = By.cssSelector("#main > header > h1");
    private static final By msgTelaDeCadastro = By.cssSelector("#main > header > h1");
    private static final By campoPrimeiroNome = By.cssSelector("input[name='firstname']");
    private static final By campoSobrenome = By.cssSelector("input[name='lastname']");
    private static final By campoEmail = By.cssSelector("section input[name='email']");
    private static final By campoSenha = By.cssSelector("input[name='password']");
    private static final By campoNascimento = By.cssSelector("input[name='birthday']");
    private static final By btnRegisterForOffers = By.cssSelector("input[name='optin']");
    private static final By btnRegisterForNewsLetters = By.cssSelector("input[name='newsletter']");
    private static final By btnTermsAndConditions = By.cssSelector("input[name='psgdpr']");
    private static final By msgSenhaDeveTerMaisQueCincoCampos = By.cssSelector("input[name='password'][title='At least 5 characters long']");
    public static final By btnTituloMr = By.cssSelector("label.radio-inline:nth-child(1) > span.custom-radio > input[name='id_gender']");
    public static final By btnTituloMrs = By.cssSelector("label.radio-inline:nth-child(2) > span.custom-radio > input[name='id_gender']");

    public String verificarMensagemNaPaginaDeLogin() {
        return lerTexto(msgTelaLogin);
    }

    public String verificarMensagemDeSenhaMenorQueCincoCampos() {
        return lerTexto(msgSenhaDeveTerMaisQueCincoCampos);
    }

    public String verificarMensagemNaPaginaDeCadastro() {
        return lerTexto(msgTelaDeCadastro);
    }

    public void clicarNoBtnDeCadastrar() {
        clicar(btnCadastrar);
    }

    private By inputTitle(int child) {
        if (child == 1) {
            return btnTituloMr;
        } else if (child == 2) {
            return btnTituloMrs;
        } else {
            // Se o valor do child não corresponder a nenhum dos casos acima, lançar uma exceção
            throw new IllegalArgumentException("Valor inválido para o parâmetro child: " + child);
        }
    }

    public void fazerCadastro(RegisterDTO registerDTO) {
        clicar(inputTitle(registerDTO.getTitle()));
        preencherInput(campoPrimeiroNome, registerDTO.getFirstName());
        preencherInput(campoSobrenome, registerDTO.getLastName());
        preencherInput(campoEmail, registerDTO.getEmail());
        preencherInput(campoSenha, registerDTO.getPassword());

        // Formatar a data para o formato desejado
        LocalDate birthdate = registerDTO.getBirthdate();
        String formattedDate = birthdate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        preencherInput(campoNascimento, formattedDate);

        clicar(btnRegisterForOffers);
        clicar(btnRegisterForNewsLetters);
        clicar(btnTermsAndConditions);

        clicar(btnSave);
    }

}
