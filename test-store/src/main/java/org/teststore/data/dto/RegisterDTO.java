package org.teststore.data.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterDTO {
    private String title;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate birthdate;
}
