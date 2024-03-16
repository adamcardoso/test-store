package org.teststore.data.factory.datafaker;

import org.teststore.data.dto.LoginDTO;
import org.teststore.util.ConfigProperties;
import org.teststore.util.DataFakerGenerator;

public class LoginData {
    DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();

    private static final String USER_PROPERTY = "User";
    private static final String PASSWORD_PROPERTY = "Password";

    public LoginDTO loginDadosValidos(){
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setEmail(ConfigProperties.getProperties().getProperty(USER_PROPERTY));
        loginDTO.setSenha(ConfigProperties.getProperties().getProperty(PASSWORD_PROPERTY));

        return loginDTO;
    }

    public LoginDTO loginDadoDinamicos(){
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setEmail(dataFakerGenerator.emailFaker());
        loginDTO.setSenha(dataFakerGenerator.senhaFaker());

        return loginDTO;
    }
}
