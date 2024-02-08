package org.teststore.data.factory.datafaker;

import org.teststore.data.dto.LoginDTO;
import org.teststore.util.DataFakerGenerator;

public class LoginData {
    DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();

    public LoginDTO loginDadosValidos(){
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setEmail("zohalasyjy@mailinator.com");
        loginDTO.setSenha("Pa$$w0rd!");

        return loginDTO;
    }

    public LoginDTO loginDadoDinamicos(){
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setEmail(dataFakerGenerator.emailFaker());
        loginDTO.setSenha(dataFakerGenerator.senhaFaker());

        return loginDTO;
    }
}
