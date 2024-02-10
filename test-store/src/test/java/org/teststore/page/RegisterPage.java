package org.teststore.page;

import org.openqa.selenium.By;
import org.teststore.data.dto.RegisterDTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RegisterPage extends BasePage{

    private static final By btnSignin = By.cssSelector("#_desktop_user_info > div > a > span");
    private static final By btnCadastrar = By.cssSelector("[data-link-action='display-register-form']");
    private static final By btnSave = By.cssSelector("#customer-form > footer > button");
    private static final By msgTelaLogin = By.cssSelector("#main > header > h1");
    private static final By msgTelaDeCadastro = By.cssSelector("#main > header > h1");
    private static final By campoPrimeiroNome = By.cssSelector("input[name='firstname']");
    private static final By campoSobrenome = By.cssSelector("input[name='lastname']");
    private static final By campoEmail = By.cssSelector("section input[name='email']");
    private static final By campoSenha = By.cssSelector("input[name='password']");
    private static final By campoNascimento = By.cssSelector("input[name='birthday']");
    private static final By campoGeneroMasculino = By.cssSelector("#customer-form > section > div:nth-child(1) > div.col-md-6.form-control-valign > label:nth-child(1) > span > input[type=radio]");
    private static final By campoGeneroFeminino = By.cssSelector("#customer-form > section > div:nth-child(1) > div.col-md-6.form-control-valign > label:nth-child(2) > span > input[type=radio]");

    public void clicarNoBtnSignin() {
        clicar(btnSignin);
    }

    public String verificarMensagemNaPaginaDeLogin() {
        return lerTexto(msgTelaLogin);
    }

    public String verificarMensagemNaPaginaDeCadastro() {
        return lerTexto(msgTelaDeCadastro);
    }

    public void clicarNoBtnDeCadastrar() {
        clicar(btnCadastrar);
    }

    public void selecionarGenero(String genero) {
        if (genero.equals("Mr.")) {
            selecionarRadioBtn(By.id(campoGeneroMasculino));
        } else if (genero.equals("Mrs.")) {
            selecionarRadioBtn(By.id(campoGeneroFeminino));
        } else {
            throw new IllegalArgumentException("Gênero inválido: " + genero);
        }
    }

    public String fazerCadastro(RegisterDTO registerDTO) {
        selecionarGenero(registerDTO.getTitle());
        preencherInput(campoPrimeiroNome, registerDTO.getFirstName());
        preencherInput(campoSobrenome, registerDTO.getLastName());
        preencherInput(campoEmail, registerDTO.getEmail());
        preencherInput(campoSenha, registerDTO.getPassword());

        // Formatar a data para o formato desejado
        LocalDate birthdate = registerDTO.getBirthdate();
        String formattedDate = birthdate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        preencherInput(campoNascimento, formattedDate);

        clicar(btnSave);

        return lerTexto(msgTelaDeCadastro);
    }
}
