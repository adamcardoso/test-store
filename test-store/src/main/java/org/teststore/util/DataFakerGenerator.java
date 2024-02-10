package org.teststore.util;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.ZoneId;

public class DataFakerGenerator {
    private static final Faker faker = new Faker();

    public String titulo(){
        String[] titulos = {"Mr.", "Mrs."};
        return titulos[faker.random().nextInt(titulos.length)];
    }

    public String primeiroNome(){
        return faker.name().firstName();
    }

    public String sobrenome(){
        return faker.name().lastName();
    }

    public String emailFaker(){
        return faker.internet().emailAddress();
    }

    public String senhaFaker(){
        return faker.internet().password();
    }

    public LocalDate nascimento() {
        return faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
