package org.teststore.data.factory.datafaker;

import org.teststore.data.dto.RegisterDTO;
import org.teststore.util.DataFakerGenerator;

public class RegisterData {
    private DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();

    public RegisterDTO cadastroDadoDinamicos(){
        RegisterDTO registerDTO = new RegisterDTO();
        registerDTO.setTitle(dataFakerGenerator.titulo());
        registerDTO.setFirstName(dataFakerGenerator.primeiroNome());
        registerDTO.setLastName(dataFakerGenerator.sobrenome());
        registerDTO.setEmail(dataFakerGenerator.emailFaker());
        registerDTO.setPassword(dataFakerGenerator.senhaFaker());
        registerDTO.setBirthdate(dataFakerGenerator.nascimento());

        return registerDTO;
    }
}
