package org.teststore.data.factory.datafaker;

import org.teststore.data.dto.RegisterDTO;
import org.teststore.util.DataFakerGenerator;

public class RegisterData {
    private final DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();
    RegisterDTO registerDTO = new RegisterDTO();

    public RegisterDTO cadastroDeUsuarioComDadosValidos(){
        registerDTO.setTitle(dataFakerGenerator.generoFaker());
        registerDTO.setFirstName(dataFakerGenerator.primeiroNome());
        registerDTO.setLastName(dataFakerGenerator.sobrenome());
        registerDTO.setEmail(dataFakerGenerator.emailFaker());
        registerDTO.setPassword(dataFakerGenerator.senhaFaker());
        registerDTO.setBirthdate(dataFakerGenerator.nascimento());

        return registerDTO;
    }
}
